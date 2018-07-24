package it.okkam.awesome.utils;

/**
 * @author simone
 *
 */
public class CharUtils {

  private CharUtils() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Check if a char is between a range
   * 
   * @param start The begin of the range
   * @param end The end of the range
   * @param toCheck The element to check
   */
  public static boolean isBetween(char start, char end, char toCheck) {
    return toCheck >= start && toCheck <= end;
  }

  /**
   * Check if a char is strict between a range
   * 
   * @param start The begin of the range
   * @param end The end of the range
   * @param toCheck The element to check
   */
  public static boolean isStrinctBetween(char start, char end, char toCheck) {
    return toCheck > start && toCheck < end;
  }
}
