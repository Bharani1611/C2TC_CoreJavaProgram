package com.tnif.DayNine.String;

public class StringSubClass {
    private String value;

    public StringSubClass(String value) {
        this.value = value;
    }

    public String toUpperCase() {
        return value.toUpperCase();
    }

    public static void main(String[] args) {
        StringSubClass s = new StringSubClass("Bharani");
        System.out.println(s.toUpperCase()); // Output: BHARANI
    }
}