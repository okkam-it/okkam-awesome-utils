package org.okkam.awesome.utils;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

  private ListUtils() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Append elements to a list.
   * 
   * @param <T> The list and elements type
   * @param list The list
   * @param elements The elements to append
   * @return The new List
   */
  public static <T> List<T> appendElementsToList(List<T> list, T... elements) {
    for (T element : elements) {
      list.add(element);
    }
    return list;
  }

  /**
   * Prepend elements to a list.
   * 
   * @param <T> The list and elements type
   * @param list The list
   * @param elements The elements to prepend
   * @return The new List
   */
  public static <T> List<T> prependElementsToList(List<T> list, T... elements) {
    int i = 0;
    for (T element : elements) {
      list.add(i++, element);
    }
    return list;
  }

  /**
   * add elements if not already contained.
   * 
   * @param <T> The list and elements type
   * @param list The list
   * @param elements The elements to add
   * @return The new List
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
   * Add element1 to the list only if it is equals to element2.
   * 
   * @param <T> The list and elements type
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
   * @param <T> The list and elements type
   * @param <T1> The type of elements to check
   * @param list The list
   * @param elemToAdd The element to add
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

  /**
   * Create an ArrayList if the List is null.
   * 
   * @param <T> The list type
   * @param list The input list
   * @return The old list or the input one
   */
  public static <T> List<T> createIfNull(List<T> list) {
    if (list == null) {
      list = new ArrayList<>();
    }
    return list;
  }
}
