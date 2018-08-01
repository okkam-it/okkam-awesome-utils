package it.okkam.awesome.utils;

import org.junit.Assert;
import org.junit.Test;

public class CharUtilsTests {

  public static final char aChar = 'a';
  public static final char zChar = 'z';
  public static final char checkChar = 'g';

  @Test
  public void testIsBetween() {
    Assert.assertTrue(CharUtils.isBetween(aChar,zChar,checkChar));
    Assert.assertTrue(CharUtils.isBetween(aChar,zChar,aChar));
    Assert.assertFalse(CharUtils.isBetween(aChar,zChar,'!'));
  }
  
  @Test
  public void testIsStrictBetween() {
    Assert.assertTrue(CharUtils.isStrictBetween(aChar,zChar,checkChar));
    Assert.assertFalse(CharUtils.isStrictBetween(aChar,zChar,aChar));
    Assert.assertFalse(CharUtils.isStrictBetween(aChar,zChar,'!'));
  }

}
