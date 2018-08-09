package org.okkam.awesome.utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class SetUtilsTest {
  protected static final List<String> ABC = Arrays.asList("a", "b", "c");
  protected static final Set<String> NOT_EMPTY = new HashSet<>(ABC);
  protected static final Set<String> EMPTY = new HashSet<>();
  protected static final Set<String> NULL = null;

  protected static final Set<String> NOT_EMPTY_2 = new HashSet<>(ABC);
  protected static final Set<String> EMPTY_2 = new HashSet<>();
  protected static final Set<String> NULL_2 = null;

  @Test
  public void testCreateHashSetIfNull() {
    Assert.assertEquals(EMPTY, OkkamSets.createHashSetIfNull(NULL));
    Assert.assertEquals(EMPTY, OkkamSets.createHashSetIfNull(EMPTY));
    Assert.assertNotSame(EMPTY, OkkamSets.createHashSetIfNull(NOT_EMPTY));

    Assert.assertEquals(NOT_EMPTY, OkkamSets.createHashSetIfNull(NOT_EMPTY));
  }

  @Test
  public void testAddSafeToHashSet() {
    Assert.assertEquals(NOT_EMPTY_2, OkkamSets.addSafeToHashSet(NULL_2, "a", "b", "c"));
    Assert.assertEquals(NOT_EMPTY_2, OkkamSets.addSafeToHashSet(EMPTY_2, "a", "b", "c"));
    Assert.assertEquals(NOT_EMPTY_2, OkkamSets.addSafeToHashSet(NOT_EMPTY_2, "a", "b", "c"));
  }

  @Test
  public void testVarArgs() {
    Set<Integer> result = addSafeToHashSet(2, 1);
    Assert.assertNotNull(result);
  }

  static <T> Set<T> addSafeToHashSet(T a, T b) {
    return OkkamSets.addSafeToHashSet(null, a, b);
  }

}
