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
}
