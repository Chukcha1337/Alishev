package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String[] numbers = scanner.nextLine().split(" ");
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        double average = (double) sum / numbers.length;
        System.out.print(average + " --> ");
        System.out.printf("%.3f", average);
        scanner.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/day16/file");
        printResult(file);
    }
}
