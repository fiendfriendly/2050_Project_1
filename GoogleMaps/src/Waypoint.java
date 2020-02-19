/*
 * CS 2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Prg01 - Waypoint class
 * Your name(s):
 */

public class Waypoint {

    private double latitude;
    private double longitude;
    private static double TOLERANCE = 0.000001;
    private static final double R = 6372.8; // earth radius in kilometers

    // TODOd: set latitude and longitude using the given values
    public Waypoint(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // TODOd: implement getters
    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    // compute the great-circle distance between two points on a sphere using the haversine formula
    public double distance(final Waypoint other) {
        double dLat = Math.toRadians(latitude - other.latitude);
        double dLon = Math.toRadians(longitude - other.longitude);
        double lat1 = Math.toRadians(latitude);
        double lat2 = Math.toRadians(other.latitude);
        double a = Math.pow(Math.sin(dLat / 2),2) + Math.pow(Math.sin(dLon / 2),2) * Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.asin(Math.sqrt(a));
        return R * c;
    }

    // TODOd:  two waypoint objects are considered equal if their correspondent latitude and
    // longitude values are close enough given an accepted tolerance value
    @Override
    public boolean equals(Object obj) {
        Waypoint other = (Waypoint)obj;
        return  Math.abs(longitude - other.longitude) <= TOLERANCE &&
                Math.abs(latitude - other.latitude) <= TOLERANCE;
    }

    // TODOd: return a string representation of a waypoint using (lat, lon) format
    @Override
    public String toString() {
        return "(" + latitude + ", " + longitude + ")";
    }
}