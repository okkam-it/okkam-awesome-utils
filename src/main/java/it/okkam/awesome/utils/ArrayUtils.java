package it.okkam.awesome.utils;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {

  private ArrayUtils() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Get the position of the object in an array
   * 
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
   * Transform the array into a list, prepending an element
   * 
   * @param elem The element to prepend
   * @param array The input array
   * @return The list composed by the element of the input array
   */
  public static <T> List<T> toListStartingWith(T elem, T[] array) {
    List<T> ret = new ArrayList<>();
    ret.add(elem);
    for (int i = 0; i < array.length; i++) {
      ret.add(array[i]);
    }
    return ret;
  }

  /**
   * Transform the array into a list, appending an element
   * 
   * @param array The input array
   * @param elem The element to append
   * @return The list composed by the element of the input array
   */
  public static <T> List<T> toListEndingWith(T[] array, T elem) {
    List<T> ret = new ArrayList<>();
    for (int i = 0; i < array.length; i++) {
      ret.add(array[i]);
    }
    ret.add(elem);
    return ret;
  }
}
