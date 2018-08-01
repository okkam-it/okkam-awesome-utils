package it.okkam.awesome.utils;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTests {

  public static final String NULL_STRING = null;
  public static final String EMPTY_STRING = "";
  public static final String BLANK_STRING = " ";
  public static final String GOOD_STRING_1 = "test string1";
  public static final String GOOD_STRING_2 = "test string2";
  public static final String GOOD_STRING_3 = "test string3";

  @Test
  public void testIsEmptyOrNull() {
    Assert.assertTrue(StringUtils.isEmptyOrNull(EMPTY_STRING));
    Assert.assertTrue(StringUtils.isEmptyOrNull(NULL_STRING));
    Assert.assertFalse(StringUtils.isEmptyOrNull(BLANK_STRING));
    Assert.assertFalse(StringUtils.isEmptyOrNull(GOOD_STRING_1));
  }

  @Test
  public void testIsNullEmptyOrBlank() {
    Assert.assertTrue(StringUtils.isNullEmptyOrBlank(EMPTY_STRING));
    Assert.assertTrue(StringUtils.isNullEmptyOrBlank(NULL_STRING));
    Assert.assertTrue(StringUtils.isNullEmptyOrBlank(BLANK_STRING));
    Assert.assertFalse(StringUtils.isNullEmptyOrBlank(GOOD_STRING_1));
  }

  @Test
  public void testIsEmptyOrBlankNotNull() {
    Assert.assertTrue(StringUtils.isEmptyOrBlankNotNull(EMPTY_STRING));
    Assert.assertFalse(StringUtils.isEmptyOrBlankNotNull(NULL_STRING));
    Assert.assertTrue(StringUtils.isEmptyOrBlankNotNull(BLANK_STRING));
    Assert.assertFalse(StringUtils.isEmptyOrBlankNotNull(GOOD_STRING_1));
  }

  @Test
  public void testNoOneIsEmptyNorBlank() {
    Assert.assertFalse(StringUtils.noOneIsEmptyNorBlank(EMPTY_STRING, BLANK_STRING, GOOD_STRING_1));
    Assert.assertFalse(StringUtils.noOneIsEmptyNorBlank(NULL_STRING, EMPTY_STRING, GOOD_STRING_1));
    Assert
        .assertTrue(StringUtils.noOneIsEmptyNorBlank(GOOD_STRING_1, GOOD_STRING_2, GOOD_STRING_3));
    Assert.assertFalse(StringUtils.noOneIsEmptyNorBlank(GOOD_STRING_1, GOOD_STRING_2, GOOD_STRING_3,
        BLANK_STRING));
  }

  @Test
  public void testNoOneIsEmpty() {
    Assert.assertFalse(StringUtils.noOneIsEmpty(EMPTY_STRING, BLANK_STRING, GOOD_STRING_1));
    Assert.assertFalse(StringUtils.noOneIsEmpty(NULL_STRING, EMPTY_STRING, GOOD_STRING_1));
    Assert.assertTrue(StringUtils.noOneIsEmpty(GOOD_STRING_1, GOOD_STRING_2, GOOD_STRING_3));
    Assert.assertTrue(
        StringUtils.noOneIsEmpty(GOOD_STRING_1, GOOD_STRING_2, GOOD_STRING_3, BLANK_STRING));
  }

  @Test
  public void testIsEmptyBlankOr() {
    Assert.assertTrue(StringUtils.isEmptyBlankOr(EMPTY_STRING, GOOD_STRING_2, GOOD_STRING_3));
    Assert.assertFalse(StringUtils.isEmptyBlankOr(NULL_STRING, GOOD_STRING_2, GOOD_STRING_3));
    Assert.assertFalse(StringUtils.isEmptyBlankOr(GOOD_STRING_1, GOOD_STRING_2, GOOD_STRING_3));
    Assert.assertTrue(StringUtils.isEmptyBlankOr(BLANK_STRING, GOOD_STRING_2, GOOD_STRING_3));
    Assert.assertTrue(
        StringUtils.isEmptyBlankOr(GOOD_STRING_1, GOOD_STRING_2, GOOD_STRING_1, GOOD_STRING_3));
  }

  @Test
  public void testAppendAll() {
    Assert.assertEquals("test string1test string2test string3", StringUtils
        .appendAll(new StringBuilder(), GOOD_STRING_1, GOOD_STRING_2, GOOD_STRING_3).toString());
  }

  @Test
  public void testSeparateArrayBy() {
    Assert.assertEquals("a|b|c", StringUtils.separateArrayBy(new String[] { "a", "b", "c" }, "|"));
    Assert.assertEquals("1|2|3", StringUtils.separateArrayBy(new Integer[] { 1, 2, 3 }, "|"));
  }

}
