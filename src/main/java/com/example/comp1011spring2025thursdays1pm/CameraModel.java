package com.example.comp1011spring2025thursdays1pm;

public class CameraModel {

    /*
            Let's create 5 attributes of a Camera
            one of which is an enum

            Brands: enum
                Canon
                Sony
                Nikon
                FujiFilm

            weight
            color
            Mode: enum
                Night
                Auto
                Manual
                LowLight
                GrayScale
            resolution
     */

    private String color;
    private double resolution;
    private float weight;
    enum Brands {CANON, NIKON, FUJIFILM, SONY}
    private Brands brand = Brands.CANON;
    //create the remaining instance variables.
    // create getters and setters
    // for String, float, and double values
    //      add restrictions

}
