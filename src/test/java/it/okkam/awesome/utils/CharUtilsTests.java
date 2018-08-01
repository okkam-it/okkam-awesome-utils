package it.okkam.awesome.utils;

import org.junit.Assert;
import org.junit.Test;

public class CharUtilsTests {

  public static final char A_CHAR = 'a';
  public static final char Z_CHAR = 'z';
  public static final char CHECK_CHAR = 'g';

  @Test
  public void testIsBetween() {
    Assert.assertTrue(CharUtils.isBetween(A_CHAR, Z_CHAR, CHECK_CHAR));
    Assert.assertTrue(CharUtils.isBetween(A_CHAR, Z_CHAR, A_CHAR));
    Assert.assertFalse(CharUtils.isBetween(A_CHAR, Z_CHAR, '!'));
  }

  @Test
  public void testIsStrictBetween() {
    Assert.assertTrue(CharUtils.isStrictBetween(A_CHAR, Z_CHAR, CHECK_CHAR));
    Assert.assertFalse(CharUtils.isStrictBetween(A_CHAR, Z_CHAR, A_CHAR));
    Assert.assertFalse(CharUtils.isStrictBetween(A_CHAR, Z_CHAR, '!'));
  }

}
