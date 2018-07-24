package it.okkam.awesome.utils;

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
   */
  public static boolean isEmptyOrNull(String string) {
    return string == null || string.isEmpty();
  }
}
