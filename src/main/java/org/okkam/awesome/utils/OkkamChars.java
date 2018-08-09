package org.okkam.awesome.utils;

public class OkkamChars {

  private OkkamChars() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Check if a char is between a range.
   * 
   * @param start The begin of the range
   * @param end The end of the range
   * @param toCheck The element to check
   * @return The check result
   */
  public static boolean isBetween(char start, char end, char toCheck) {
    return toCheck >= start && toCheck <= end;
  }

  /**
   * Check if a char is strict between a range.
   * 
   * @param start The begin of the range
   * @param end The end of the range
   * @param toCheck The element to check
   * @return The check result
   */
  public static boolean isStrictBetween(char start, char end, char toCheck) {
    return toCheck > start && toCheck < end;
  }
}
