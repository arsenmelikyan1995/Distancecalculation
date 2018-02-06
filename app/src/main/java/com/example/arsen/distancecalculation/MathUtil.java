
package com.example.arsen.distancecalculation;

import static java.lang.Math.asin;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;


class MathUtil {

    static final double EARTH_RADIUS = 6371009;


    static double hav(double x) {
        double sinHalf = sin(x * 0.5);
        return sinHalf * sinHalf;
    }


    static double arcHav(double x) {
        return 2 * asin(sqrt(x));
    }

    static double havDistance(double lat1, double lat2, double dLng) {
        return hav(lat1 - lat2) + hav(dLng) * cos(lat1) * cos(lat2);
    }
}
