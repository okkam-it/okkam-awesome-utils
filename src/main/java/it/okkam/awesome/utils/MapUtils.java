package it.okkam.awesome.utils;

import java.util.List;
import java.util.Map;

/**
 * @author simone
 *
 */
public class MapUtils {

  private MapUtils() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Return the list composed by the key set of the map
   * 
   * @param map The input map
   */
  public static <T> List<T> keySetToList(Map<T, T> map) {
    return SetUtils.toList(map.keySet());
  }


  /**
   * Put an element into the map if it the key does not exists
   * 
   * @param map The map
   * @param key The key
   * @param value The value
   * @return The input map
   */
  public static <T> Map<T, T> putIfNotExists(Map<T, T> map, T key, T value) {
    if (!map.containsKey(key)) {
      map.put(key, value);
    }
    return map;
  }
}