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

  /**
   * Check if the string is null, blank or empty
   * 
   * @param string The input string
   */
  public static boolean isNullEmptyOrBlank(String string) {
    return isEmptyOrNull(string) || string.trim().isEmpty();
  }

  /**
   * Check if the string is empty or blank
   * 
   * @param string The input string
   */
  public static boolean isEmptyOrBlanNotNull(String string) {
    return string != null && (string.isEmpty() || string.trim().isEmpty());
  }

  /**
   * Append to the string Builder all elements
   * 
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
}
