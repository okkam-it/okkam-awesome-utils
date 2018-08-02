package org.okkam.awesome.utils;

import java.util.Comparator;

/**
 * @author simone
 *
 */
public class ComparatorUtils {

  private ComparatorUtils() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Comparator to sort ascending
   * 
   * @return The comparator
   */
  public static Comparator<Integer> sortAscending() {
    return (Integer i1, Integer i2) -> i1.compareTo(i2);
  }

  /**
   * Comparator to sort descending
   * 
   * @return The comparator
   */
  public static Comparator<Integer> sortDescending() {
    return (Integer i1, Integer i2) -> i2.compareTo(i1);
  }

  /**
   * Comparator to sort alphabetically
   * 
   * @return The comparator
   */
  public static Comparator<String> sortAlphabetically() {
    return (String s1, String s2) -> s1.compareTo(s2);
  }

  /**
   * Comparator to sort reverse alphabetically
   * 
   * @return The comparator
   */
  public static Comparator<String> sortReverseAlphabetically() {
    return (String s1, String s2) -> s2.compareTo(s1);
  }
}