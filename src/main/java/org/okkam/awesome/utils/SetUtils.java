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
   * @return The null set or the input one
   */
  public static <T> Set<T> addIfNotNull(Set<T> set, T element) {
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
   * @return The empty set or the input one.
   */
  public static <T> Set<T> createHashSetIfNull(Set<T> set) {
    if (set == null) {
      set = new HashSet<>();
    }
    return set;
  }

  /**
   * Add elements to the HashSet. Create a new HashSet if the Set is null (initialized with
   * elements).
   * 
   * @param <T> The Set type
   * @param set The input set
   * @param elements The elements to add
   * @return The set initialized with elements (if empty) or the input one adding elements.
   */
  public static <T> Set<T> addSafeToHashSet(Set<T> set, T... elements) {
    set = createHashSetIfNull(set);
    for (T element : elements) {
      set.add(element);
    }
    return set;
  }
}
