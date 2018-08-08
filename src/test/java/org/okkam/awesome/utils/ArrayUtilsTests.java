package org.okkam.awesome.utils;

import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;
import org.okkam.awesome.utils.ArrayUtils;

// NOSONAR
public class ArrayUtilsTests {

  protected static final Character[] CHAR_ARRAY = { 'a', 'b', 'c' };
  protected static final Integer[] INT_ARRAY = { 0, 1, 2, 3, 4, 5, 6, 7 };
  protected static final String[] STRING_ARRAY = { "abc", "cde", "efg", "ghi" };

  @Test
  public void testindexOf() {
    Assert.assertEquals(0, ArrayUtils.indexOf(CHAR_ARRAY, 'a'));
    Assert.assertEquals(0, ArrayUtils.indexOf(INT_ARRAY, 0));
    Assert.assertEquals(0, ArrayUtils.indexOf(STRING_ARRAY, "abc"));

    Assert.assertEquals(-1, ArrayUtils.indexOf(CHAR_ARRAY, 'd'));
    Assert.assertEquals(-1, ArrayUtils.indexOf(INT_ARRAY, 8));
    Assert.assertEquals(-1, ArrayUtils.indexOf(STRING_ARRAY, "lmn"));
  }

  @Test
  public void testaddAll() {
    Character[] tmp = ArrayUtils.addAll(CHAR_ARRAY, '1');
    Assert.assertEquals(tmp.length - 1, ArrayUtils.indexOf(tmp, '1'));
    tmp = ArrayUtils.addAll(tmp, '2');
    Assert.assertEquals(tmp.length - 1, ArrayUtils.indexOf(tmp, '2'));
    tmp = ArrayUtils.addAll(tmp, '3');
    Assert.assertEquals(tmp.length - 1, ArrayUtils.indexOf(tmp, '3'));

    Character[] all = ArrayUtils.addAll(CHAR_ARRAY, '1', '2', '3');
    Assert.assertArrayEquals(tmp, all);
  }

  @Test
  public void testAddAllAssignableOk() {
    BigInteger[] bigIntegerArray = new BigInteger[] { BigInteger.valueOf(1L) };
    Number[] numberArray1 = new Number[] { Integer.valueOf(1) };
    ArrayUtils.addAll(numberArray1, bigIntegerArray);
    Number[] numberArray2 = new Number[] { BigInteger.valueOf(1L) };
    ArrayUtils.addAll(numberArray1, numberArray2);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testAddAllAssignableKo() {
    BigInteger[] bigIntegerArray = new BigInteger[] { BigInteger.valueOf(1L) };
    Number[] numberArray = new Number[] { Integer.valueOf(1) };
    ArrayUtils.addAll(bigIntegerArray, numberArray);
  }
}
