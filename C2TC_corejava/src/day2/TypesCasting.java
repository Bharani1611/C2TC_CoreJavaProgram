package day2;

public class TypesCasting {

    public static void main(String[] args) {

        short temperature = 25;
        int cityTemp = temperature;
        System.out.println("Temperature as int: " + cityTemp);

        int speed = 100;
        double carSpeed = speed;
        System.out.println("Speed as double: " + carSpeed);

        char letter = 'k';
        int asciiValue = letter;
        System.out.println("ASCII of 'k': " + asciiValue);

        char emoji = '\u263A';
        int emojiCode = emoji;
        System.out.println("Unicode of ☺: " + emojiCode);

        double price = 1999.98;
        int roundedPrice = (int) price;
        System.out.println("Rounded Price: " + roundedPrice);

        long distance = 9876543210L;
        int shortDistance = (int) distance;
        System.out.println("Distance (with overflow): " + shortDistance);

        float pi = 3.14159f;
        byte piAsByte = (byte) pi;
        System.out.println("Pi as byte: " + piAsByte);

        int num = 66;
        char charFromNum = (char) num;
        System.out.println("Character from 66: " + charFromNum);
    }
}
