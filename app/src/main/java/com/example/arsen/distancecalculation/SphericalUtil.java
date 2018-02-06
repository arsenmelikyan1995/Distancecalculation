
package com.example.arsen.distancecalculation;

import com.google.android.gms.maps.model.LatLng;


import static com.example.arsen.distancecalculation.MathUtil.EARTH_RADIUS;
import static com.example.arsen.distancecalculation.MathUtil.arcHav;
import static com.example.arsen.distancecalculation.MathUtil.havDistance;


import static java.lang.Math.toRadians;

public class SphericalUtil {

    private SphericalUtil() {}


    private static double distanceRadians(double lat1, double lng1, double lat2, double lng2) {
        return arcHav(havDistance(lat1, lat2, lng1 - lng2));
    }

    static double computeAngleBetween(LatLng from, LatLng to) {
        return distanceRadians(toRadians(from.latitude), toRadians(from.longitude),
                               toRadians(to.latitude), toRadians(to.longitude));
    }

    public static double computeDistanceBetween(LatLng from, LatLng to) {
        return computeAngleBetween(from, to) * EARTH_RADIUS;
    }


}
