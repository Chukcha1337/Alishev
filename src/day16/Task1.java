package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {

    public static void printResult(File file) {
        try{
        Scanner scanner = new Scanner(file);
        String[] numbers = scanner.nextLine().split(" ");
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        double average = (double) sum / numbers.length;
        System.out.printf(average + " --> %.3f", average);

        scanner.close();
    } catch (FileNotFoundException e) {
            System.out.println("File not found");}
    }

    public static void main(String[] args) {
        File file = new File("src/day16/file");
        printResult(file);
    }
}
