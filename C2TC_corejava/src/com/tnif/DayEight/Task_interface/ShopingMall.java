package com.tnif.DayEight.Task_interface;

public class ShopingMall {

    public static void main(String[] args) {

        Purchase clothes = new Clothes();
        Purchase grocery = new Grocery();
        Purchase cosmetics = new Cosmetics();

        clothes.buying();
        grocery.buying();
        cosmetics.buying();
    }

}
