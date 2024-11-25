package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static File createFile1() throws FileNotFoundException {
        File file = new File("src/day16/file1");
            PrintWriter writer = new PrintWriter(file);
            Random random = new Random();
            for (int i = 0; i < 1000; i++) {
                writer.println(random.nextInt(100));
            }
            writer.close();

        return file;
    }

    public static File createFile2(File file)  {
        File file1 = new File("src/day16/file2");
        try {
            Scanner scanner = new Scanner(file);
            List<Integer> list = new ArrayList<>();

            while (scanner.hasNextLine()) {
                list.add(Integer.parseInt(scanner.nextLine()));
            }

            PrintWriter writer1 = new PrintWriter(file1);
            for (int i = 0; i < list.size(); i += 20) {
                int sum = 0;
                for (int j = i; j < i + 20; j++) {
                    sum += list.get(j);
                }
                double avg = (double) sum / 20;
                writer1.print(avg + " ");
            }
            scanner.close();
            writer1.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return file1;
    }
    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String[] numbers = scanner.nextLine().split(" ");
            List<Double> list = new ArrayList<>();
            for (String number : numbers) {
                list.add(Double.parseDouble(number));
            }
            double sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            System.out.println(sum);
            int summa = (int) sum;
            System.out.println(summa);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        printResult(createFile2(createFile1()));
    }
}
