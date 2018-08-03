package org.okkam.awesome.utils;

import org.junit.Assert;
import org.junit.Test;
import org.okkam.awesome.utils.ArrayUtils;

// NOSONAR
public class ArrayUtilsTests {

  protected static final Character[] CHAR_ARRAY = {'a', 'b', 'c'};
  protected static final Integer[] INT_ARRAY = {0, 1, 2, 3, 4, 5, 6, 7};
  protected static final String[] STRING_ARRAY = {"abc", "cde", "efg", "ghi"};

  @Test
  public void testGetObjPos() {
    Assert.assertEquals(0, ArrayUtils.getObjPos(CHAR_ARRAY, 'a'));
    Assert.assertEquals(0, ArrayUtils.getObjPos(INT_ARRAY, 0));
    Assert.assertEquals(0, ArrayUtils.getObjPos(STRING_ARRAY, "abc"));

    Assert.assertEquals(-1, ArrayUtils.getObjPos(CHAR_ARRAY, 'd'));
    Assert.assertEquals(-1, ArrayUtils.getObjPos(INT_ARRAY, 8));
    Assert.assertEquals(-1, ArrayUtils.getObjPos(STRING_ARRAY, "lmn"));
  }

  @Test
  public void testAddElementToArray() {
    Character[] tmp = ArrayUtils.addElementToArray(CHAR_ARRAY, '1');
    Assert.assertEquals(tmp.length - 1, ArrayUtils.getObjPos(tmp, '1'));
    tmp = ArrayUtils.addElementToArray(tmp, '2');
    Assert.assertEquals(tmp.length - 1, ArrayUtils.getObjPos(tmp, '2'));
    tmp = ArrayUtils.addElementToArray(tmp, '3');
    Assert.assertEquals(tmp.length - 1, ArrayUtils.getObjPos(tmp, '3'));

    Character[] all = ArrayUtils.addElementToArray(CHAR_ARRAY, '1', '2', '3');
    Assert.assertArrayEquals(tmp, all);
  }

}
