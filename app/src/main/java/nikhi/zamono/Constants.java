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
    static final float GEOFENCE_RADIUS_IN_METERS = 30; // 1 mile, 1.6 km

    /**
     * Map for storing information about airports in the San Francisco bay area.
     */
    static final HashMap<String, LatLng> HOSPITAL_LANDMARKS = new HashMap<>();
    static final HashMap<String, Double> DISTANCES = new HashMap<>();


    static {
        // San Francisco International Airport.
        HOSPITAL_LANDMARKS.put("HOME", new LatLng(37.324894, -122.048428));
        HOSPITAL_LANDMARKS.put("SPORTSCENTER", new LatLng(37.324682, -122.047318));
        HOSPITAL_LANDMARKS.put("MONTAVISTA", new LatLng(37.324420, -122.046826));

    }
    static {
        // San Francisco International Airport.
        DISTANCES.put("HOME:SPORTSCENTER", new Double(2.0));
        DISTANCES.put("SPORTSCENTER:MONTAVISTA", new Double(4.0));
        DISTANCES.put("MONTAVISTA:HOME", new Double(3.0));
        DISTANCES.put("HOME:MONTAVISTA", new Double(3.0));
        DISTANCES.put("MONTAVISTA:SPORTSCENTER", new Double(4.0));
        DISTANCES.put("SPORTSCENTER:HOME", new Double(2.0));

    }

    static double cost = 4.00;


}
