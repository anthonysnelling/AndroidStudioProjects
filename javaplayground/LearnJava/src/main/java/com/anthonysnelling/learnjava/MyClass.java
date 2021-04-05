package com.anthonysnelling.learnjava;

public class MyClass {
    public static void main(String[] args) {
        Microphone microphone = new Microphone(); //instantiating our object
        microphone.color = "Blue";
        microphone.name = "Blue Yeti";
        microphone.model = 133543;

        Microphone ghMic = new Microphone();
        ghMic.model = 465;
        ghMic.name = "GHZB";
        ghMic.color = "Red";
        System.out.println(microphone.name + " " + microphone.color + " " + microphone.model);
        System.out.println(ghMic.name);

        Microphone shure = new Microphone();
        shure.model = 123123;
        shure.name = "Shure MX";
        shure.color = "Black";
        System.out.println(shure.name);

        microphone.turnOn();
        microphone.setVolume();
        microphone.turnOff();
        System.out.println(ghMic.showDescription());
        ghMic.turnOn();
        ghMic.setVolume();
        ghMic.turnOff();
    }
}