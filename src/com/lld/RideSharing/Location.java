package com.lld.RideSharing;

public class Location {
    private final long longitude;
    private final long lattitude;
    private final String name;

    public Location(long longitude, long lattitude, String name) {
        this.longitude = longitude;
        this.lattitude = lattitude;
        this.name = name;
    }

    public long getLongitude() {
        return longitude;
    }

    public long getLattitude() {
        return lattitude;
    }

    public String getName() {
        return name;
    }
}
