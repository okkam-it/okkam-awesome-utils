package org.okkam.awesome.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayUtils {

  private ArrayUtils() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Get the position of the object in an array
   * 
   * @param <T> The input type
   * @param array The input array
   * @param obj The element to find
   * @return the position into the array. -1 otherwise.
   */
  public static <T> int getObjPos(T[] array, T obj) {
    for (int i = 0; i < array.length; i++) {
      if (array[i].equals(obj)) {
        return i;
      }
    }
    return -1;
  }

  /**
   * Transform the array into a list
   * 
   * @param <T> The input type
   * @param array The input array
   * @return The list composed by the element of the input array
   */
  public static <T> List<T> toList(T[] array) {
    List<T> ret = new ArrayList<>();
    for (int i = 0; i < array.length; i++) {
      ret.add(array[i]);
    }
    return ret;
  }


  /**
   * Transform the array into a list, prepending a set of elements
   * 
   * @param <T> The input type
   * @param array The input array
   * @param elems The elements to prepend
   * @return The list composed by the element of the input array
   */
  public static <T> List<T> toListStartingWith(T[] array, T... elems) {
    List<T> ret = new ArrayList<>();
    for (T elem : elems) {
      ret.add(elem);
    }
    for (T arrayElem : array) {
      ret.add(arrayElem);
    }
    return ret;
  }

  /**
   * Transform the array into a list, appending a set of elements
   * 
   * @param <T> The input type
   * @param array The input array
   * @param elems The elements to append
   * @return The list composed by the element of the input array
   */
  public static <T> List<T> toListEndingWith(T[] array, T... elems) {
    List<T> ret = new ArrayList<>();
    for (T arrayElem : array) {
      ret.add(arrayElem);
    }
    for (T elem : elems) {
      ret.add(elem);
    }
    return ret;
  }

  /**
   * Append a single element to an array
   * 
   * @param <T> The input type
   * @param array The array
   * @param addElmt The elements to append
   * @return The new array
   */
  public static <T> T[] addElementToArray(T[] array, T... addElmt) {
    T[] newArray = Arrays.copyOf(array, array.length + addElmt.length);
    System.arraycopy(addElmt, 0, newArray, array.length, addElmt.length);
    return newArray;
  }

  /**
   * Append a List of elements to an array
   * 
   * @param <T> The input type
   * @param array The array
   * @param addElmts The List of elements to append
   * @return The new array
   */
  public static <T> T[] addElementsToArray(T[] array, List<T> addElmts) {
    T[] newArray = Arrays.copyOf(array, array.length + addElmts.size());
    System.arraycopy(array, 0, newArray, 0, array.length);
    for (int i = 0; i < addElmts.size(); i++) {
      newArray[array.length + i] = addElmts.get(i);
    }
    return newArray;
  }

}
