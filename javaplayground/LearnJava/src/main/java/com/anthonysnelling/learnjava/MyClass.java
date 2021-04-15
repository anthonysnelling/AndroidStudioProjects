package com.anthonysnelling.learnjava;

import java.sql.SQLOutput;
import java.time.chrono.MinguoChronology;
import java.util.ArrayList;

public class MyClass {
    public static void main(String[] args) {
        ////        Person tony = new Person(); using default constructor
//        Employee employee = new Employee();
//        employee.setFirstName("James");
//        employee.setLastName("Hello");
//        employee.setAge(34);
//        System.out.println(employee.getAge());
//        employee.setId(2345);
//        System.out.println(employee.getId());
//        employee.setAnnualSalary(100000);
//        System.out.println(employee.getAnnualSalary());
//
//        Manager manager = new Manager();
//        manager.setFirstName("George");
//        manager.setLastName("Kilos");
//        manager.setAge(55);
//        manager.setAnnualSalary(250000);
//        manager.setId(456);
//        System.out.println(manager.getAnnualSalary() + ", " + manager.getLastName() + ", " + manager.getFirstName() +
//                ", " + manager.getId());
//
//        //overrode the toString method for this
//        System.out.println(manager.toString());
//        // and this
//        System.out.println(employee.toString());

//        ARRAYS
        int[] myArray = {1, 21, 33, 42};
        System.out.println(myArray[0]);
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);
        String[] names = {"James" , "Anthony", "Rodrigo", "Niraj"};
        System.out.println(names[1]);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
            System.out.println(names[i]);
        }

        int[] newArr = new int[4];
        String[] newStrArr = new String[3];

        newArr[0] = 12;
        newArr[1] = 13;
        newArr[2] = 14;
        newArr[3] = 22;
        for (int value : newArr) {
            System.out.println(value);
        }

//      ARRAY LISTS
//      more verbose way VVVVV
//      ArrayList<String> name = new ArrayList<>();
//        doesn't clarify a type VVV
        ArrayList name = new ArrayList();
        name.add("Tony");
        name.add("James");
        name.add("Bonni");
        name.add("Chicken");
//        System.out.println(name.get(3));
        for (int i = 0; i < name.size(); i++) {
            System.out.println("Names: " + name.get(i));
        }
//        using a for each on a non declared area means you have to call the object super class
        for (Object nam : name) {
            System.out.println("Names2 : " + nam);
        }

//        Using a strict arrayList
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
               nums.add(i*2);
        }
        for (Integer numbers : nums) {
            System.out.println("Numbers: " + numbers);
        }
    }
}


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
//        Microphone shure = new Microphone("Shure MX", "Black", 1231245);
//        System.out.println(shure.showDescription());
//        shure.setColor("Red");
//        shure.setName("Shure MX2");
//
//        shure.turnOn();
//        shure.setVolume();
//        shure.turnOff();
//        System.out.println(shure.showDescription());
//
////        using default constructor for overloading
//        Microphone otherMic = new Microphone();
//        otherMic.setColor("Red");
//
////        using a different constructor
//        // by ctrl clicking the new instance it will take you to the constructor so you can check
//        Microphone difConstMic = new Microphone("WMX", "Purple");