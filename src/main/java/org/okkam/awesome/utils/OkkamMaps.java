package org.okkam.awesome.utils;

import java.util.List;
import java.util.Map;

public class OkkamMaps {

  private OkkamMaps() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Return the list composed by the values of the map.
   * 
   * @param <V> The map value type
   * @param map The input map
   * @return The List composed by the value set of the map
   */
  public static <V> List<V> valuesToList(Map<?, V> map) {
    return OkkamCollections.toList(map.values());
  }

  /**
   * Put an element into the map if it the key does not exists.
   *
   * @param <K> The map key type
   * @param <V> The map value type
   * @param map The map
   * @param key The key
   * @param value The value
   * @return The input map
   */
  public static <K, V> Map<K, V> putIfNotExists(Map<K, V> map, K key, V value) {
    if (!map.containsKey(key)) {
      map.put(key, value);
    }
    return map;
  }
}
