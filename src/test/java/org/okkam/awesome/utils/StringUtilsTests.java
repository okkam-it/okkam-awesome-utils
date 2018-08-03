package org.okkam.awesome.utils;

import org.junit.Assert;
import org.junit.Test;
import org.okkam.awesome.utils.StringUtils;

public class StringUtilsTests {

  public static final String NULL_STRING = null;
  public static final String EMPTY_STRING = "";
  public static final String BLANK_STRING = " ";
  public static final String GOOD_STRING_1 = "test string1";
  public static final String GOOD_STRING_2 = "test string2";
  public static final String GOOD_STRING_3 = "test string3";

  @Test
  public void testIsEmptyOrNull() {
    Assert.assertTrue(StringUtils.isEmptyOrNull(EMPTY_STRING, false));
    Assert.assertTrue(StringUtils.isEmptyOrNull(NULL_STRING, false));
    Assert.assertFalse(StringUtils.isEmptyOrNull(BLANK_STRING, false));
    Assert.assertFalse(StringUtils.isEmptyOrNull(GOOD_STRING_1, false));
  }

  @Test
  public void testIsNullEmptyOrBlank() {
    Assert.assertTrue(StringUtils.isEmptyOrNull(EMPTY_STRING, true));
    Assert.assertTrue(StringUtils.isEmptyOrNull(NULL_STRING, true));
    Assert.assertTrue(StringUtils.isEmptyOrNull(BLANK_STRING, true));
    Assert.assertFalse(StringUtils.isEmptyOrNull(GOOD_STRING_1, true));
  }

  @Test
  public void testIsEmptyOrBlankNotNull() {
    Assert.assertTrue(StringUtils.isEmptyAndNotNull(EMPTY_STRING, true));
    Assert.assertFalse(StringUtils.isEmptyAndNotNull(NULL_STRING, true));
    Assert.assertTrue(StringUtils.isEmptyAndNotNull(BLANK_STRING, true));
    Assert.assertFalse(StringUtils.isEmptyAndNotNull(GOOD_STRING_1, true));
  }

  @Test
  public void testNoOneIsEmptyNorBlank() {
    Assert.assertFalse(
        StringUtils.noOneIsEmptyOrNull(true, EMPTY_STRING, BLANK_STRING, GOOD_STRING_1));
    Assert.assertFalse(
        StringUtils.noOneIsEmptyOrNull(true, NULL_STRING, EMPTY_STRING, GOOD_STRING_1));
    Assert.assertTrue(
        StringUtils.noOneIsEmptyOrNull(true, GOOD_STRING_1, GOOD_STRING_2, GOOD_STRING_3));
    Assert.assertFalse(StringUtils.noOneIsEmptyOrNull(true, GOOD_STRING_1, GOOD_STRING_2,
        GOOD_STRING_3, BLANK_STRING));
  }

  @Test
  public void testNoOneIsEmpty() {
    Assert.assertFalse(
        StringUtils.noOneIsEmptyOrNull(false, EMPTY_STRING, BLANK_STRING, GOOD_STRING_1));
    Assert.assertFalse(
        StringUtils.noOneIsEmptyOrNull(false, NULL_STRING, EMPTY_STRING, GOOD_STRING_1));
    Assert.assertTrue(
        StringUtils.noOneIsEmptyOrNull(false, GOOD_STRING_1, GOOD_STRING_2, GOOD_STRING_3));
    Assert.assertTrue(StringUtils.noOneIsEmptyOrNull(false, GOOD_STRING_1, GOOD_STRING_2,
        GOOD_STRING_3, BLANK_STRING));
  }

  @Test
  public void testIsEmptyBlankOr() {
    Assert.assertTrue(StringUtils.isOneOf(null, true, GOOD_STRING_2, null));
    Assert.assertFalse(StringUtils.isOneOf(null, true, GOOD_STRING_2, EMPTY_STRING));
    Assert.assertFalse(StringUtils.isOneOf(EMPTY_STRING, true, GOOD_STRING_2, GOOD_STRING_2));
    Assert.assertFalse(StringUtils.isOneOf(EMPTY_STRING, true, GOOD_STRING_2, GOOD_STRING_3));
    Assert.assertTrue(StringUtils.isOneOf(EMPTY_STRING, true, EMPTY_STRING, GOOD_STRING_3));
    Assert.assertFalse(StringUtils.isOneOf(NULL_STRING, true, GOOD_STRING_2, GOOD_STRING_3));
    Assert.assertFalse(StringUtils.isOneOf(GOOD_STRING_1, true, GOOD_STRING_2, GOOD_STRING_3));
    Assert.assertFalse(StringUtils.isOneOf(BLANK_STRING, true, GOOD_STRING_2, GOOD_STRING_3));
    Assert.assertTrue(StringUtils.isOneOf(BLANK_STRING, true, EMPTY_STRING, GOOD_STRING_3));
    Assert.assertTrue(
        StringUtils.isOneOf(GOOD_STRING_1, true, GOOD_STRING_2, GOOD_STRING_1, GOOD_STRING_3));
  }

  @Test
  public void testAppendAll() {
    Assert.assertEquals("test string1test string2test string3", StringUtils
        .appendAll(new StringBuilder(), GOOD_STRING_1, GOOD_STRING_2, GOOD_STRING_3).toString());
  }

  @Test
  public void testRrimIfNecessary() {
    Assert.assertEquals("hi", StringUtils.trimIfNecessary(true, "hi "));
    Assert.assertNotEquals("hi", StringUtils.trimIfNecessary(false, "hi "));
    Assert.assertEquals(null, StringUtils.trimIfNecessary(false, null));
    Assert.assertEquals(null, StringUtils.trimIfNecessary(true, null));
  }

  @Test
  public void testSeparateArrayBy() {
    Assert.assertEquals("a|b|c", StringUtils.separateArrayBy(new String[] { "a", "b", "c" }, "|"));
    Assert.assertEquals("1|2|3", StringUtils.separateArrayBy(new Integer[] { 1, 2, 3 }, "|"));
  }

}
