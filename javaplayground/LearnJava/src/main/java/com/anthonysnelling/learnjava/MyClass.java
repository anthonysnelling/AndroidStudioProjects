package com.anthonysnelling.learnjava;

import java.time.chrono.MinguoChronology;

public class MyClass {
    public static void main(String[] args) {

//        setup without a constructor
//        Microphone microphone = new Microphone(); //instantiating our object with the default constructor
        // having to define out properties
//        microphone.color = "Blue";
//        microphone.name = "Blue Yeti";
//        microphone.model = 133543;

//        microphone.turnOn();
//        microphone.setVolume();
//        microphone.turnOff();

//        setup with a constructor
        Microphone shure = new Microphone("Shure MX", "Black", 1231245);
        System.out.println(shure.showDescription());
        shure.setColor("Red");
        shure.setName("Shure MX2");

        shure.turnOn();
        shure.setVolume();
        shure.turnOff();
        System.out.println(shure.showDescription());

//        using default constructor for overloading
        Microphone otherMic = new Microphone();
        otherMic.setColor("Red");

//        using a different constructor
        // by ctrl clicking the new instance it will take you to the constructor so you can check
        Microphone difConstMic = new Microphone("WMX", "Purple");

    }
}