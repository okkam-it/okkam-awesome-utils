package it.okkam.awesome.utils;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTests {

  public static final String nullString = null;
  public static final String emptyString = "";
  public static final String blankString = " ";
  public static final String goodString1 = "test string1";
  public static final String goodString2 = "test string2";
  public static final String goodString3 = "test string3";

  @Test
  public void testIsEmptyOrNull() {
    Assert.assertTrue(StringUtils.isEmptyOrNull(emptyString));
    Assert.assertTrue(StringUtils.isEmptyOrNull(nullString));
    Assert.assertFalse(StringUtils.isEmptyOrNull(blankString));
    Assert.assertFalse(StringUtils.isEmptyOrNull(goodString1));
  }

  @Test
  public void testIsNullEmptyOrBlank() {
    Assert.assertTrue(StringUtils.isNullEmptyOrBlank(emptyString));
    Assert.assertTrue(StringUtils.isNullEmptyOrBlank(nullString));
    Assert.assertTrue(StringUtils.isNullEmptyOrBlank(blankString));
    Assert.assertFalse(StringUtils.isNullEmptyOrBlank(goodString1));
  }

  @Test
  public void testIsEmptyOrBlankNotNull() {
    Assert.assertTrue(StringUtils.isEmptyOrBlankNotNull(emptyString));
    Assert.assertFalse(StringUtils.isEmptyOrBlankNotNull(nullString));
    Assert.assertTrue(StringUtils.isEmptyOrBlankNotNull(blankString));
    Assert.assertFalse(StringUtils.isEmptyOrBlankNotNull(goodString1));
  }

  @Test
  public void testNoOneIsEmptyNorBlank() {
    Assert.assertFalse(StringUtils.noOneIsEmptyNorBlank(emptyString, blankString, goodString1));
    Assert.assertFalse(StringUtils.noOneIsEmptyNorBlank(nullString, emptyString, goodString1));
    Assert.assertTrue(StringUtils.noOneIsEmptyNorBlank(goodString1, goodString2, goodString3));
    Assert.assertFalse(
        StringUtils.noOneIsEmptyNorBlank(goodString1, goodString2, goodString3, blankString));
  }

  @Test
  public void testNoOneIsEmpty() {
    Assert.assertFalse(StringUtils.noOneIsEmpty(emptyString, blankString, goodString1));
    Assert.assertFalse(StringUtils.noOneIsEmpty(nullString, emptyString, goodString1));
    Assert.assertTrue(StringUtils.noOneIsEmpty(goodString1, goodString2, goodString3));
    Assert.assertTrue(StringUtils.noOneIsEmpty(goodString1, goodString2, goodString3, blankString));
  }

  @Test
  public void testIsEmptyBlankOr() {
    Assert.assertTrue(StringUtils.isEmptyBlankOr(emptyString, goodString2, goodString3));
    Assert.assertFalse(StringUtils.isEmptyBlankOr(nullString, goodString2, goodString3));
    Assert.assertFalse(StringUtils.isEmptyBlankOr(goodString1, goodString2, goodString3));
    Assert.assertTrue(StringUtils.isEmptyBlankOr(blankString, goodString2, goodString3));
    Assert
        .assertTrue(StringUtils.isEmptyBlankOr(goodString1, goodString2, goodString1, goodString3));
  }

  @Test
  public void testAppendAll() {
    Assert.assertEquals("test string1test string2test string3", StringUtils
        .appendAll(new StringBuilder(), goodString1, goodString2, goodString3).toString());
  }

  @Test
  public void testSeparateArrayBy() {
    Assert.assertEquals("a|b|c", StringUtils.separateArrayBy(new String[] { "a", "b", "c" }, "|"));
    Assert.assertEquals("1|2|3", StringUtils.separateArrayBy(new Integer[] { 1, 2, 3 }, "|"));
  }

}
