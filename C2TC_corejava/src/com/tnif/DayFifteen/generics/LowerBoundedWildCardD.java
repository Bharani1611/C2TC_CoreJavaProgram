package com.tnif.DayFifteen.generics;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildCardD {

    public static void main(String args[]) {

        List<Integer> intList = Arrays.asList(1, 2, 3);
        System.out.println("Display Integer values:");
        displayNumbers(intList); // ✅

        List<Number> numberList = Arrays.asList(1.0, 2.0, 3.0, 10, 4, 30);
        System.out.println("Display Number values:");
        displayNumbers(numberList); // ✅

        List<Double> doubleList = Arrays.asList(1.0, 2.0, 3.0, 9.0);
        System.out.println("Display Double values:");
           }

    
    public static void displayNumbers(List<? super Integer> list) {
        for (Object num : list) {
            System.out.println(num);
        }
    }
}
