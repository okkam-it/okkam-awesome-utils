package org.okkam.awesome.utils;

import org.junit.Assert;
import org.junit.Test;

public class OkkamStringsTests {

  public static final String NULL_STRING = null;
  public static final String EMPTY_STRING = "";
  public static final String BLANK_STRING = " ";
  public static final String GOOD_STRING_1 = "test string1";
  public static final String GOOD_STRING_2 = "test string2";
  public static final String GOOD_STRING_3 = "test string3";
  public static final String STRING_WITHOUT_SPACES = "stringwithnospaces";

  public static final String STRING_TO_DUPLICATE = "abc";
  public static final String STRING_TO_SPLIT_1 = "  a  b  c";
  public static final String STRING_TO_SPLIT_2 = "a,b,c,d,e,f,g,h,i";
  public static final String STRING_TO_SPLIT_3 = "a,b,c,d,e,f,g,h,i,,";
  public static final String[] STRING_TO_MANIPULATE = { "a", "b", "c", "d", "e", "f" };


  @Test
  public void testIsEmptyOrNull() {
    Assert.assertTrue(OkkamStrings.isEmptyOrNull(EMPTY_STRING, false));
    Assert.assertTrue(OkkamStrings.isEmptyOrNull(NULL_STRING, false));
    Assert.assertFalse(OkkamStrings.isEmptyOrNull(BLANK_STRING, false));
    Assert.assertFalse(OkkamStrings.isEmptyOrNull(GOOD_STRING_1, false));
  }

  @Test
  public void testIsNullEmptyOrBlank() {
    Assert.assertTrue(OkkamStrings.isEmptyOrNull(EMPTY_STRING, true));
    Assert.assertTrue(OkkamStrings.isEmptyOrNull(NULL_STRING, true));
    Assert.assertTrue(OkkamStrings.isEmptyOrNull(BLANK_STRING, true));
    Assert.assertFalse(OkkamStrings.isEmptyOrNull(GOOD_STRING_1, true));
  }

  @Test
  public void testIsEmptyOrBlankNotNull() {
    Assert.assertTrue(OkkamStrings.isEmptyAndNotNull(EMPTY_STRING, true));
    Assert.assertFalse(OkkamStrings.isEmptyAndNotNull(NULL_STRING, true));
    Assert.assertTrue(OkkamStrings.isEmptyAndNotNull(BLANK_STRING, true));
    Assert.assertFalse(OkkamStrings.isEmptyAndNotNull(GOOD_STRING_1, true));
  }

  @Test
  public void testNoOneIsEmptyNorBlank() {
    Assert.assertFalse(
        OkkamStrings.noOneIsEmptyOrNull(true, EMPTY_STRING, BLANK_STRING, GOOD_STRING_1));
    Assert.assertFalse(
        OkkamStrings.noOneIsEmptyOrNull(true, NULL_STRING, EMPTY_STRING, GOOD_STRING_1));
    Assert.assertTrue(
        OkkamStrings.noOneIsEmptyOrNull(true, GOOD_STRING_1, GOOD_STRING_2, GOOD_STRING_3));
    Assert.assertFalse(OkkamStrings.noOneIsEmptyOrNull(true, GOOD_STRING_1, GOOD_STRING_2,
        GOOD_STRING_3, BLANK_STRING));
  }

  @Test
  public void testNoOneIsEmpty() {
    Assert.assertFalse(
        OkkamStrings.noOneIsEmptyOrNull(false, EMPTY_STRING, BLANK_STRING, GOOD_STRING_1));
    Assert.assertFalse(
        OkkamStrings.noOneIsEmptyOrNull(false, NULL_STRING, EMPTY_STRING, GOOD_STRING_1));
    Assert.assertTrue(
        OkkamStrings.noOneIsEmptyOrNull(false, GOOD_STRING_1, GOOD_STRING_2, GOOD_STRING_3));
    Assert.assertTrue(OkkamStrings.noOneIsEmptyOrNull(false, GOOD_STRING_1, GOOD_STRING_2,
        GOOD_STRING_3, BLANK_STRING));
  }

  @Test
  public void testIsEmptyBlankOr() {
    Assert.assertTrue(OkkamStrings.isOneOf(null, true, GOOD_STRING_2, null));
    Assert.assertFalse(OkkamStrings.isOneOf(null, true, GOOD_STRING_2, EMPTY_STRING));
    Assert.assertFalse(OkkamStrings.isOneOf(EMPTY_STRING, true, GOOD_STRING_2, GOOD_STRING_2));
    Assert.assertFalse(OkkamStrings.isOneOf(EMPTY_STRING, true, GOOD_STRING_2, GOOD_STRING_3));
    Assert.assertTrue(OkkamStrings.isOneOf(EMPTY_STRING, true, EMPTY_STRING, GOOD_STRING_3));
    Assert.assertFalse(OkkamStrings.isOneOf(NULL_STRING, true, GOOD_STRING_2, GOOD_STRING_3));
    Assert.assertFalse(OkkamStrings.isOneOf(GOOD_STRING_1, true, GOOD_STRING_2, GOOD_STRING_3));
    Assert.assertFalse(OkkamStrings.isOneOf(BLANK_STRING, true, GOOD_STRING_2, GOOD_STRING_3));
    Assert.assertTrue(OkkamStrings.isOneOf(BLANK_STRING, true, EMPTY_STRING, GOOD_STRING_3));
    Assert.assertTrue(
        OkkamStrings.isOneOf(GOOD_STRING_1, true, GOOD_STRING_2, GOOD_STRING_1, GOOD_STRING_3));
  }

  @Test
  public void testAppendAll() {
    Assert.assertEquals("test string1test string2test string3", OkkamStrings
        .appendAll(new StringBuilder(), GOOD_STRING_1, GOOD_STRING_2, GOOD_STRING_3).toString());
  }

  @Test
  public void testTrimIfNecessary() {
    Assert.assertEquals("hi", OkkamStrings.trimIfNecessary(true, "hi "));
    Assert.assertNotEquals("hi", OkkamStrings.trimIfNecessary(false, "hi "));
    Assert.assertEquals(null, OkkamStrings.trimIfNecessary(false, null));
    Assert.assertEquals(null, OkkamStrings.trimIfNecessary(true, null));
  }

  @Test
  public void testSeparateArrayBy() {
    Assert.assertEquals("a|b|c", OkkamStrings.separateArrayBy(new String[] { "a", "b", "c" }, "|"));
    Assert.assertEquals("1|2|3", OkkamStrings.separateArrayBy(new Integer[] { 1, 2, 3 }, "|"));
  }

  @Test
  public void testSplitByChar() {
    Assert.assertArrayEquals(STRING_TO_SPLIT_1.split(" "),
        OkkamStrings.splitByChar(STRING_TO_SPLIT_1, ' '));
    Assert.assertArrayEquals(STRING_TO_SPLIT_2.split(","),
        OkkamStrings.splitByChar(STRING_TO_SPLIT_2, ','));

    Assert.assertEquals(STRING_WITHOUT_SPACES.split(" ").length,
        OkkamStrings.splitByChar(STRING_WITHOUT_SPACES, ' ').length);
    Assert.assertNotEquals(STRING_TO_SPLIT_3.split(",").length,
        OkkamStrings.splitByChar(STRING_TO_SPLIT_3, ',').length);
    Assert.assertArrayEquals(new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "", "" },
        OkkamStrings.splitByChar(STRING_TO_SPLIT_3, ','));
  }

  @Test
  public void testConcatRange() {
    Assert.assertEquals("a,b,c", OkkamStrings.concatRange(STRING_TO_MANIPULATE, ",", 0, 2));
    Assert.assertEquals("a", OkkamStrings.concatRange(STRING_TO_MANIPULATE, ",", 0, 0));
    Assert.assertEquals("d", OkkamStrings.concatRange(STRING_TO_MANIPULATE, ",", 3, 3));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConcatRangeFail() {
    OkkamStrings.concatRange(STRING_TO_MANIPULATE, ",", 3, 2);
  }

  @Test
  public void testConcatRanges() {
    Assert.assertEquals("a,b,c,e,f",
        OkkamStrings.concatRanges(STRING_TO_MANIPULATE, ",", 0, 2, 4, 5));
    Assert.assertEquals("a,f", OkkamStrings.concatRanges(STRING_TO_MANIPULATE, ",", 0, 0, 5, 5));
    Assert.assertEquals("d,a,b,c",
        OkkamStrings.concatRanges(STRING_TO_MANIPULATE, ",", 3, 3, 0, 2));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConcatRangesFail() {
    OkkamStrings.concatRanges(STRING_TO_MANIPULATE, ",", 3, 2, 1);
  }

  @Test
  public void testDuplicate() {
    Assert.assertEquals("abc", OkkamStrings.duplicate(STRING_TO_DUPLICATE, 1));
    Assert.assertEquals("abcabcabcabcabc", OkkamStrings.duplicate(STRING_TO_DUPLICATE, 5));
  }

}
