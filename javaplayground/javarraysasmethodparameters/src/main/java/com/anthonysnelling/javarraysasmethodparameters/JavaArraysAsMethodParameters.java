package com.anthonysnelling.javarraysasmethodparameters;

public class JavaArraysAsMethodParameters {
    public static void main(String[] args) {
        int[] numbers = {12, 0 ,34, 100, 34, 2, 3, 5 ,10, 78, 69 ,12349};
        findMultThree(numbers);
    }

    public static void findMultThree(int[] arr){
        if (arr.length > 0) {
            System.out.print("These are the multiples of three: ");
            for (int num : arr) {
                if (num % 3 == 0)
                System.out.print(num + " ");
            }
        }else {
            System.out.println("empty array");
        }

    }
}