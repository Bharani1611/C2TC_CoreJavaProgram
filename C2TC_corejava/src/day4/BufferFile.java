package day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\ASUS\\git\\Day1\\C2TC_corejava\\src\\day4\\bufferText"; // 🔁 Change path to your file location

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line); // 📖 Print each line
            }

            reader.close(); // 🔐 Always close the file reader
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
