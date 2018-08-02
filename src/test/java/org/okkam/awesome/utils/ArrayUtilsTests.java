package org.okkam.awesome.utils;

import org.junit.Assert;
import org.junit.Test;
import org.okkam.awesome.utils.ArrayUtils;

// NOSONAR
public class ArrayUtilsTests {

  protected static final Character[] CHAR_ARRAY = { 'a', 'b', 'c' };
  protected static final Integer[] INT_ARRAY = { 0, 1, 2, 3, 4, 5, 6, 7 };
  protected static final String[] STRING_ARRAY = { "abc", "cde", "efg", "ghi" };

  @Test
  public void testGetObjPos() {
    Assert.assertEquals(0, ArrayUtils.getObjPos(CHAR_ARRAY, 'a'));
    Assert.assertEquals(0, ArrayUtils.getObjPos(INT_ARRAY, 0));
    Assert.assertEquals(0, ArrayUtils.getObjPos(STRING_ARRAY, "abc"));

    Assert.assertEquals(-1, ArrayUtils.getObjPos(CHAR_ARRAY, 'd'));
    Assert.assertEquals(-1, ArrayUtils.getObjPos(INT_ARRAY, 8));
    Assert.assertEquals(-1, ArrayUtils.getObjPos(STRING_ARRAY, "lmn"));
  }

}
