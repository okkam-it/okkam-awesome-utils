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
   * @param list The list
   * @param elements The elements to prepend
   */
  public static <T> List<T> prependElementsToList(List<T> list, T... elements) {
    List<T> ret = new ArrayList<>();
    for (T element : elements) {
      ret.add(element);
    }
    ret.addAll(list);
    return ret;
  }

  /**
   * add elements if not already contained
   * 
   * @param list The list
   * @param elements The elements to add
   */
  public static <T> List<T> addIfNotContained(List<T> list, T... elements) {
    for (T element : elements) {
      if (!list.contains(element)) {
        list.add(element);
      }
    }
    return list;
  }

  /**
   * Add element1 to the list only if it is equals to element2
   * 
   * @param list The list
   * @param element1 The first element
   * @param element2 The second element
   * @return The input list
   */
  public static <T> List<T> addIfEquals(List<T> list, T element1, T element2) {
    if (element1.equals(element2)) {
      list.add(element1);
    }
    return list;
  }

  /**
   * Add elemToAdd to the list only if element1 is equals to element2
   * 
   * @param list The list
   * @param element1 The element to add
   * @param element1 The first element
   * @param element2 The second element
   * @return The input list
   */
  public static <T, T1> List<T> addIfEquals(List<T> list, T elemToAdd, T1 element1, T1 element2) {
    if (element1.equals(element2)) {
      list.add(elemToAdd);
    }
    return list;
  }
}
