package com.anthonysnelling.learnjava;

public class Microphone {
//    instance variables/ properties/ fields
    private String name;
    private String color;
    private int model;

//    reclaiming default constructor for overloading
    public Microphone(){}

//   constructor, helps with making new instances
    public Microphone(String name, String color, int model) {
        this.name = name;
        this.color = color;
        this.model = model;
    }

//    can make many forms of constructor as you want for different properties
//    this is overloading, just can't have the exact some parameters and same number of them
    public Microphone(String name, String color){
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    //Actions/ Methods
    public void  turnOff(){
        System.out.println(this.name + " Turn off");
    }
    public void  turnOn(){
        System.out.println(this.name + " Turn on");
    }
    public void  setVolume(){
        System.out.println(this.name + " Setting volume");
    }

    public String showDescription(){
        return "Microphone name: " + this.name + ", with color: " + this.color + ", and its model " + this.model;
    }

}
