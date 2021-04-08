package com.anthonysnelling.learnjava;

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

        shure.turnOn();
        shure.setVolume();
        shure.turnOff();
        shure.showDescription();
    }
}