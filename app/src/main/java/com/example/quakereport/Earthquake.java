package com.example.quakereport;

/**
 * An {@link Earthquake} object contains info related to single earthquake
 */

public class Earthquake {
    /** Magnitude of a earthQuake */
    private Double mMagnitude;

    /** Place of the earthquake */
    private String mLocation;

    /** Time of the earthquake */
    private Long mTime;

    /** url of earthquake */
    private String mUrl;

    /**
     * Constructor for earthquake Object
     * @param magnitude
     * @param location
     * @param time
     */
    public Earthquake(Double magnitude, String location, Long time,String url)
    {
        mMagnitude = magnitude;
        mLocation = location;
        mTime = time;
        mUrl = url;
    }
    /** @return magnitude */
    public Double getMagnitude()
    {
        return mMagnitude;
    }

    /** @return place */
    public String getLocation()
    {
        return mLocation;
    }

    /** @return time */
    public Long getTime()
    {
        return mTime;
    }

    /** @return url */
    public String getUrl()
    {
        return mUrl;
    }
}
