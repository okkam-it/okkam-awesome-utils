package org.okkam.awesome.utils;

public class OkkamGeoUtils {

  /**
   * Return the distance in meters between the two WGS84 points (lat1,lon1) and (lat2,lon2).
   * 
   * @param lat1 latitude point 1
   * @param lon1 longitude point 1
   * @param lat2 latitude point 2
   * @param lon2 longitude point 2
   * @return the distance in meters between the 2 points
   */
  public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
    final double earthRadius = 6371000; // m

    lat1 = Math.toRadians(lat1);
    lat2 = Math.toRadians(lat2);

    lon1 = Math.toRadians(lon1);
    lon2 = Math.toRadians(lon2);

    return Math.acos(
        Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon2 - lon1))
        * earthRadius;
  }
}
