package it.okkam.awesome.utils;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

  private ListUtils() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Append elements to a list
   * 
   * @param array The list
   * @param addElmt The elements to append
   */
  public static <T> List<T> appendElementsToList(List<T> list, T... elements) {
    for (T element : elements) {
      list.add(element);
    }
    return list;
  }

  /**
   * Prepend elements to a list
   * 
   * @param array The list
   * @param addElmt The elements to prepend
   */
  public static <T> List<T> prependElementsToList(List<T> list, T... elements) {
    List<T> ret = new ArrayList<T>();
    for (T element : elements) {
      ret.add(element);
    }
    ret.addAll(list);
    return ret;
  }
}
