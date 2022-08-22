package com.example._01_creational_patterns._04_builder.java._02_after;

import com.example._01_creational_patterns._04_builder.java._01_before.TourPlan;

public class App {

    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();
    }
}
