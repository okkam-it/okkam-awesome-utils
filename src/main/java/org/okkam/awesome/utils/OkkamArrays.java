package org.okkam.awesome.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OkkamArrays {

  private OkkamArrays() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Get the position of the object in an array.
   * 
   * @param <T> The input type
   * @param array The input array
   * @param valueToFind The value to find
   * @return the position into the array. -1 otherwise.
   */
  public static <T> int indexOf(T[] array, T valueToFind) {
    return org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind);
  }

  /**
   * Transform the input array into an ArrayList.
   * 
   * @param <T> The input type
   * @param sourceArray The input array
   * @return The list composed by the element of the input array
   */
  public static <T> List<T> toArrayList(T[] sourceArray) {
    final ArrayList<T> targetList = new ArrayList<>(sourceArray.length);
    Collections.addAll(targetList, sourceArray);
    return targetList;
  }


  /**
   * Transform the array into an ArrayList, prepending a set of elements.
   * 
   * @param <T> The input type
   * @param array The input array
   * @param elems The elements to prepend
   * @return The list composed by the element of the input array
   */
  @SafeVarargs
  public static <T> List<T> toArrayListStartingWith(T[] array, T... elems) {
    final ArrayList<T> ret = new ArrayList<>(elems.length);
    Collections.addAll(ret, elems);
    Collections.addAll(ret, array);
    return ret;
  }

  /**
   * Transform the array into an ArrayList, appending a set of elements.
   * 
   * @param <T> The input type
   * @param array The input array
   * @param elements The elements to append
   * @return The list composed by the element of the input array
   */
  public static <T> List<T> toArrayListEndingWith(T[] array, T... elements) {
    final ArrayList<T> ret = new ArrayList<>(elements.length);
    Collections.addAll(ret, array);
    Collections.addAll(ret, elements);
    return ret;
  }

  /**
   * Append elements to an array.
   * 
   * @param <T> The input type
   * @param array The array
   * @param elements The elements to append
   * @return The new array
   */
  public static <T> T[] addAll(T[] array, T... elements) {
    return org.apache.commons.lang3.ArrayUtils.addAll(array, elements);
  }

  /**
   * Append a List of elements to an array.
   * 
   * @param <T> The input type
   * @param array The array
   * @param addElmts The List of elements to append
   * @return The new array
   */
  public static <T> T[] addAll(T[] array, List<T> addElmts) {
    T[] newArray = Arrays.copyOf(array, array.length + addElmts.size());
    System.arraycopy(array, 0, newArray, 0, array.length);
    for (int i = 0; i < addElmts.size(); i++) {
      newArray[array.length + i] = addElmts.get(i);
    }
    return newArray;
  }

}
