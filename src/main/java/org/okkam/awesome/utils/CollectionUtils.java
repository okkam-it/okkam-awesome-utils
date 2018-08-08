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
    org.apache.commons.collections4.CollectionUtils.addAll(ret, coll);
    return ret;
  }

  /**
   * Adds all elements in the array to the given collection.
   *
   * @param <C> the type of object the {@link Collection} contains
   * @param collection the collection to add to, must not be null
   * @param elements the array of elements to add, must not be null
   * @return {@code true} if the collection was changed, {@code false} otherwise
   * @throws NullPointerException if the collection or array is null
   */
  public static <T> boolean addAll(List<T> collection, T... elements) {
    return org.apache.commons.collections4.CollectionUtils.addAll(collection, elements);

  }
}
