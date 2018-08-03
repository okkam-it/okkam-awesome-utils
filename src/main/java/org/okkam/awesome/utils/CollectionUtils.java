package org.okkam.awesome.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionUtils {

  private CollectionUtils() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Return a list from a collection.
   * 
   * @param <T> The collection type
   * @param coll The input collection
   * @return The collection as a list
   */
  public static <T> List<T> toList(Collection<T> coll) {
    if (coll instanceof List) {
      return (List<T>) coll;
    }
    final List<T> ret = new ArrayList<>(coll.size());
    for (T item : coll) {
      ret.add(item);
    }
    return ret;
  }
}
