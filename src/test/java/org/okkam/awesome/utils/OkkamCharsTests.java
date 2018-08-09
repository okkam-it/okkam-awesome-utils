package org.okkam.awesome.utils;

import org.junit.Assert;
import org.junit.Test;
import org.okkam.awesome.utils.OkkamChars;

public class OkkamCharsTests {

  public static final char A_CHAR = 'a';
  public static final char Z_CHAR = 'z';
  public static final char CHECK_CHAR = 'g';

  @Test
  public void testIsBetween() {
    Assert.assertTrue(OkkamChars.isBetween(A_CHAR, Z_CHAR, CHECK_CHAR));
    Assert.assertTrue(OkkamChars.isBetween(A_CHAR, Z_CHAR, A_CHAR));
    Assert.assertFalse(OkkamChars.isBetween(A_CHAR, Z_CHAR, '!'));
  }

  @Test
  public void testIsStrictBetween() {
    Assert.assertTrue(OkkamChars.isStrictBetween(A_CHAR, Z_CHAR, CHECK_CHAR));
    Assert.assertFalse(OkkamChars.isStrictBetween(A_CHAR, Z_CHAR, A_CHAR));
    Assert.assertFalse(OkkamChars.isStrictBetween(A_CHAR, Z_CHAR, '!'));
  }

}
