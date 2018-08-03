package org.okkam.awesome.utils;

import java.util.HashSet;
import java.util.Set;

public class SetUtils {

  private SetUtils() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Add if not empty.
   * 
   * @param <T> The Set and element type
   * @param set The input set
   * @param element The element to add
   * @return The empty set or the input one
   */
  public static <T> Set<T> addIfNotEmpty(Set<T> set, T element) {
    if (element != null) {
      set.add(element);
    }
    return set;
  }

  /**
   * Create an HashSet if the Set is null.
   * 
   * @param <T> The Set type
   * @param set The input set
   * @return The empty set or the input one
   */
  public static <T> Set<T> createHashSetIfNull(Set<T> set) {
    if (set == null) {
      set = new HashSet<>();
    }
    return set;
  }
}
