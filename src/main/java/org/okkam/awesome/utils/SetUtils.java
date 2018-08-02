package org.okkam.awesome.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author simone
 *
 */
public class SetUtils {

  private SetUtils() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Return a list from a set
   * 
   * @param <T> The Set type
   * @param set The input set
   * @return The list based on the set
   */
  public static <T> List<T> toList(Set<T> set) {
    List<T> ret = new ArrayList<>();
    for (T item : set) {
      ret.add(item);
    }
    return ret;
  }

  /**
   * Add if not empty
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
   * Create an HashSet if the Set is null;
   * 
   * @param <T> The Set type
   * @param set The input set
   * @return The empty set or the input one
   */
  public static <T> Set<T> createIfNull(Set<T> set) {
    if (set == null) {
      set = new HashSet<>();
    }
    return set;
  }
}
