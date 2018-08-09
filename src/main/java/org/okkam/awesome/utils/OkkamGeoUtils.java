package org.okkam.awesome.utils;

public class OkkamGeoUtils {

  private static final double EARTH_RADIUS = 6371000; // in meters

  private OkkamGeoUtils() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Return the distance in meters between the two WGS84 points (lat1,lon1) and (lat2,lon2) using
   * the spherical law of cosines. See https://www.movable-type.co.uk/scripts/latlong.html for
   * details.
   * 
   * @param lat1 latitude point 1
   * @param lon1 longitude point 1
   * @param lat2 latitude point 2
   * @param lon2 longitude point 2
   * @return the distance in meters between the 2 points
   */
  public static double sphericalLawOfCosinesDistance(//
      double lat1, double lon1, double lat2, double lon2) {

    lat1 = Math.toRadians(lat1);
    lat2 = Math.toRadians(lat2);

    lon1 = Math.toRadians(lon1);
    lon2 = Math.toRadians(lon2);

    // d = acos((sin lat1)(sin lat2) + (cos lat1)(cos lat2)(cos (lon diff))) x R
    return Math.acos(
        Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon2 - lon1))
        * EARTH_RADIUS;
  }
}
