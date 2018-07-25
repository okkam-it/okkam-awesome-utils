package it.okkam.awesome.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author simone
 *
 */
public class CollectionUtils {

  private CollectionUtils() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Return a list from a collection
   * 
   * @param set The input collection
   */
  public static <T> List<T> toList(Collection<T> coll) {
    List<T> ret = new ArrayList<>();
    for (T item : coll) {
      ret.add(item);
    }
    return ret;
  }
}
