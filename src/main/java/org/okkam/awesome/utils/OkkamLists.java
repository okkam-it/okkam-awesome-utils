package org.okkam.awesome.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OkkamLists {

  private OkkamLists() {
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
  @SafeVarargs
  public static <T> List<T> appendElements(List<T> list, T... elements) {
    Collections.addAll(list, elements);
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
  @SafeVarargs
  public static <T> List<T> prependElements(List<T> list, T... elements) {
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
  @SafeVarargs
  public static <T> List<T> addIfNotContained(List<T> list, T... elements) {
    for (T element : elements) {
      if (!list.contains(element)) {
        list.add(element);
      }
    }
    return list;
  }

  /**
   * Add elemToAdd to the list only if it is equals to elemToCompare.
   * 
   * @param <T> The list and elements type
   * @param list The list
   * @param elemToAdd The element to add
   * @param elemToCompare The second element
   * @return true if the elemToAdd was added, false otherwise
   */
  public static <T> boolean addIfEquals(List<T> list, T elemToAdd, T elemToCompare) {
    if (elemToAdd.equals(elemToCompare)) {
      list.add(elemToAdd);
      return true;
    }
    return false;
  }

  /**
   * Add elemToAdd to the list only if element1 is equals to element2.
   * 
   * @param <T> The list and elements type
   * @param <T1> The type of elements to check
   * @param list The list
   * @param elemToAdd The element to add
   * @param element1 The first element
   * @param element2 The second element
   * @return true if the elemToAdd was added, false otherwise
   */
  public static <T, T1> boolean addIfEquals(List<T> list, T elemToAdd, T1 element1, T1 element2) {
    if (element1.equals(element2)) {
      list.add(elemToAdd);
      return true;
    }
    return false;
  }

  /**
   * Create an ArrayList if the List is null.
   * 
   * @param <T> The list type
   * @param list The input list
   * @return The old list or the input one
   */
  public static <T> List<T> createArrayListIfNull(List<T> list) {
    return list == null ? new ArrayList<>() : list;
  }
}
