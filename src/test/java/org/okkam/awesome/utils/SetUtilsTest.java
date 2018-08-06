package org.okkam.awesome.utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetUtilsTest {
  protected static final List<String> ABC = Arrays.asList("a", "b", "c");
  protected static final Set<String> NOT_EMPTY = new HashSet<>(ABC);
  protected static final Set<String> EMPTY = new HashSet<>();
  protected static final Set<String> NULL = null;

  @Test
  public void testCreateHashSetIfNull() {
    Assert.assertEquals(EMPTY, SetUtils.createHashSetIfNull(NULL));
    Assert.assertEquals(EMPTY, SetUtils.createHashSetIfNull(EMPTY));
    Assert.assertNotSame(EMPTY, SetUtils.createHashSetIfNull(NOT_EMPTY));

    Assert.assertEquals(NOT_EMPTY, SetUtils.createHashSetIfNull(NOT_EMPTY));
  }

}
