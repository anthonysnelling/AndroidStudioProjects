package com.anthonysnelling.javahashmaps;

import java.util.HashMap;

public class JavaHashmaps {
    public static void main(String[] args) {
        HashMap <String, Integer> gamestats = new HashMap<>();
        gamestats.put("Tony", 1400);
        gamestats.put("James", 100);
        gamestats.put("Carolina", 1200);

        System.out.println(gamestats);
        System.out.println(gamestats.get("James"));

//        gamestats.clear();
        System.out.println(gamestats + "\n");

//        for each on a hashmap needs to loop through either each key or each value
        for (String player: gamestats.keySet()) {
            System.out.println(player);
        }

//        need -V- the correct type for either keys or values, whatever you are looping through
        for (Integer scores: gamestats.values()) {
            System.out.println(scores);
        }

        for (String player: gamestats.keySet()) {
            System.out.println("Name: " + player + ", score: " + gamestats.get(player) );
        }
    }
}