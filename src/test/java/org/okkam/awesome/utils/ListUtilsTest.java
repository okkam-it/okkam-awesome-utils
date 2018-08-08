package org.okkam.awesome.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class ListUtilsTest {
  protected static final List<String> abc = Arrays.asList("a", "b", "c");
  protected static final List<String> abcLinked = new LinkedList<>(abc);
  protected static final List<String> abcArray = new ArrayList<>(abc);

  @Test
  public void testPrependElementsToListOk() {
    ListUtils.prependElements(abcLinked, "d");
    ListUtils.prependElements(abcArray, "d");
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testPrependElementsToListKo() {
    ListUtils.prependElements(abc, "d");
  }
}
