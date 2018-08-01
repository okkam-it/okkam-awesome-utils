package it.okkam.awesome.utils;

import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilsTests {

  public static final Character[] charArray = { 'a', 'b', 'c' };
  public static final Integer[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7 };
  public static final String[] stringArray = { "abc", "cde", "efg", "ghi" };

  @Test
  public void testGetObjPos() {
    Assert.assertEquals(0, ArrayUtils.getObjPos(charArray, 'a'));
    Assert.assertEquals(0, ArrayUtils.getObjPos(intArray, 0));
    Assert.assertEquals(0, ArrayUtils.getObjPos(stringArray, "abc"));
    
    Assert.assertEquals(-1, ArrayUtils.getObjPos(charArray, 'd'));
    Assert.assertEquals(-1, ArrayUtils.getObjPos(intArray, 8));
    Assert.assertEquals(-1, ArrayUtils.getObjPos(stringArray, "lmn"));
  }

}
