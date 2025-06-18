package com.tnif.dayTwo;

public class PrimitiveDataType {

    public static void main(String[] args) {

        byte age = 20;
        byte maxByte = 127;
        byte minByte = -128;
        System.out.println("Age: " + age + " | Byte range: " + minByte + " to " + maxByte);

        short distanceInKm = 15000;
        short maxShort = 32767;
        short minShort = -32768;
        System.out.println("Distance: " + distanceInKm + " km | Short range: " + minShort + " to " + maxShort);

        int population = 1380000000;
        int maxInt = 2147483647;
        int minInt = -2147483648;
        System.out.println("Population: " + population + " | Int range: " + minInt + " to " + maxInt);

        long worldDebt = 90000000000000L;
        long maxLong = 9223372036854775807L;
        long minLong = -9223372036854775808L;
        System.out.println("World Debt: ₹" + worldDebt + " | Long range: " + minLong + " to " + maxLong);

        float pi = 3.14159f;
        float temp = 36.6f;
        System.out.println("Pi: " + pi + " | Body Temp: " + temp + " °C");

        double bankBalance = 12345678.987654321;
        System.out.println("Bank Balance: ₹" + bankBalance);

        boolean isStudent = true;
        boolean hasGraduated = false;
        System.out.println("Is Student: " + isStudent + " | Graduated: " + hasGraduated);
    }
}
