package nikhi.zamono;




import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Constants used in program in order to allow for geofencing. Geofencing combines the awareness of
 * the users location and the awareness of the proximity to locations of interest
 * specified through constants with latitude and longitude attributes
 * through LatLng object.
 */

final class Constants {

    private Constants() {
    }

    private static final String PACKAGE_NAME = "com.google.android.gms.location.Geofence";

    static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    /**
     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    private static final long GEOFENCE_EXPIRATION_IN_HOURS = 12;

    /**
     * For this sample, geofences expire after twelve hours.
     */
    static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
    static final float GEOFENCE_RADIUS_IN_METERS = 1609; // 1 mile, 1.6 km

    /**
     * Map for storing information about airports in the San Francisco bay area.
     */
    static final HashMap<String, LatLng> HOSPITAL_LANDMARKS = new HashMap<>();

    static {
        // San Francisco International Airport.
        HOSPITAL_LANDMARKS.put("HOME", new LatLng(37.325330, -122.048352));
        HOSPITAL_LANDMARKS.put("SPACES", new LatLng(37.380502, -121.960555));
        HOSPITAL_LANDMARKS.put("West valley", new LatLng(37.621313, -122.378955));


    }
}
