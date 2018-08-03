package org.okkam.awesome.utils;

import java.util.Map;
import java.util.Map.Entry;

public class StringUtils {

  private StringUtils() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Check if the string is null or empty.
   * 
   * @param string The input string
   * @param trim true to trim the input string (when not null)
   * @return The check result
   */
  public static boolean isEmptyOrNull(String string, boolean trim) {
    return string == null || (trim ? string.trim().isEmpty() : string.isEmpty());
  }

  /**
   * Check if the string is empty and not null.
   * 
   * @param string The input string
   * @param trim true to trim the input string (when not null)
   * @return The check result
   */
  public static boolean isEmptyAndNotNull(String string, boolean trim) {
    return string != null && (trim ? string.trim().isEmpty() : string.isEmpty());
  }

  /**
   * Check if the strings are not empty and not blank.
   * 
   * @param trim true to trim the strings (when not empty)
   * @param strings The input strings
   * @return The check result
   */
  public static boolean noOneIsEmptyOrNull(boolean trim, String... strings) {
    for (String string : strings) {
      if (isEmptyOrNull(string, trim)) {
        return false;
      }
    }
    return true;
  }

  /**
   * Check if the string is one of the specified values. String could also be null, in this case the
   * method will return true if there's a null element in the passed array.
   * 
   * @param string The input string
   * @param trim true to trim the strings to check for equality
   * @param ors The values to check
   * @return A boolean value depending on the result
   */
  public static boolean isOneOf(String string, boolean trim, String... ors) {
    string = trimIfNecessary(true, string);

    for (String or : ors) {
      if (string == null) {
        if (or == null) {
          return true;
        }
      } else {
        or = trimIfNecessary(trim, or);
        if (string.equals(or)) {
          return true;
        }
      }
    }
    return false;
  }

  /**
   * Returns the trimmed string when not null and necessary (i.e. trim is true).
   * 
   * @param trim true to trim the passed string
   * @param src the string to trim (maybe)
   * @return the trimmed string (if necessary). Return null if src is null.
   */
  public static String trimIfNecessary(boolean trim, String src) {
    return src != null && trim ? src.trim() : src;
  }

  /**
   * Append to the string Builder all elements.
   * 
   * @param <T> The elements type
   * @param sb The string builder
   * @param elements The elements to append
   * @return The new string builder
   */
  @SafeVarargs
  public static <T> StringBuilder appendAll(StringBuilder sb, T... elements) {
    for (T element : elements) {
      sb.append(element);
    }
    return sb;
  }

  /**
   * Generate a string based on array, with a specified separator.
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
      sb.append(array[i] == null ? "" : array[i]);
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
