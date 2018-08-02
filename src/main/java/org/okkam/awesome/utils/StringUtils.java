package org.okkam.awesome.utils;

import java.util.Map;
import java.util.Map.Entry;

/**
 * @author simone
 *
 */
public class StringUtils {

  private StringUtils() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Check if the string is null or empty
   * 
   * @param string The input string
   * @return The check result
   */
  public static boolean isEmptyOrNull(String string) {
    return string == null || string.isEmpty();
  }

  /**
   * Check if the string is null, blank or empty
   * 
   * @param string The input string
   * @return The check result
   */
  public static boolean isNullEmptyOrBlank(String string) {
    return isEmptyOrNull(string) || string.trim().isEmpty();
  }

  /**
   * Check if the string is empty or blank
   * 
   * @param string The input string
   * @return The check result
   */
  public static boolean isEmptyOrBlankNotNull(String string) {
    return string != null && (string.isEmpty() || string.trim().isEmpty());
  }

  /**
   * Check if the strings are empty or blank
   * 
   * @param strings The input strings
   * @return The check result
   */
  public static boolean noOneIsEmptyNorBlank(String... strings) {
    for (String string : strings) {
      if (string == null || string.isEmpty() || string.trim().isEmpty()) {
        return false;
      }
    }
    return true;
  }

  /**
   * Check if the strings are empty
   * 
   * @param strings The input strings
   * @return The check result
   */
  public static boolean noOneIsEmpty(String... strings) {
    for (String string : strings) {
      if (string == null || string.isEmpty()) {
        return false;
      }
    }
    return true;
  }

  /**
   * Check if the string is empty or has one of specified values
   * 
   * @param string The input string
   * @param ors The values to check
   * @return A boolean value depending on the result
   */
  public static boolean isEmptyBlankOr(String string, String... ors) {
    if (string == null) {
      return false;
    }
    if (string.isEmpty() || string.trim().isEmpty()) {
      return true;
    }
    for (String or : ors) {
      if (string.equals(or)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Append to the string Builder all elements
   * 
   * @param <T> The elements type
   * @param sb The string builder
   * @param elements The elements to append
   * @return The new string builder
   */
  public static <T> StringBuilder appendAll(StringBuilder sb, T... elements) {
    for (T element : elements) {
      sb.append(element);
    }
    return sb;
  }

  /**
   * Generate a string based on array, with a specified separator
   * 
   * @param <T> The array type
   * @param array The input array
   * @param separator The separator
   * @return The generated string
   */
  public static <T> String separateArrayBy(T[] array, String separator) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < array.length; i++) {
      if (i > 0) {
        sb.append(separator);
      }
      if (array[i] != null) {
        sb.append(array[i]);
      }
    }
    return sb.toString();
  }

  /**
   * Generate a string based on map values, with a specified separator. Use a tree map to guarantee
   * ordering.
   * 
   * @param <T> The map key type
   * @param map The input map
   * @param separator The separator
   * @return The generated string
   */
  public static <T> String separateTreeMapValuesBy(Map<T, String> map, String separator) {
    StringBuilder sb = new StringBuilder();
    int i = 0;
    for (Entry<T, String> entry : map.entrySet()) {
      if (i > 0) {
        sb.append(separator);
      }
      sb.append(entry.getValue());
      i++;
    }

    return sb.toString();
  }
}
