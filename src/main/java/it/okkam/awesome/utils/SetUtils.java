package it.okkam.awesome.utils;

import java.util.ArrayList;
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
   * @param set The input set
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
   * @param set The input set
   * @param element The element to add
   */
  public static <T> Set<T> toList(Set<T> set, T element) {
    if (element != null) {
      set.add(element);
    }
    return set;
  }
}
