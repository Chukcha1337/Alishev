package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {

    private static final File FILE = new File("src/day14/file");

    public static void printSumDigits(File file) {

        try {
            Scanner scanner = new Scanner(file);

                String[] numbers = scanner.nextLine().split(" ");

                if (numbers.length != 10)
                        throw new Not10Exeption();

                int sum = 0;
                for (String a : numbers) {
                    sum += Integer.parseInt(a);
                }
                System.out.println(sum);


            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }catch (Not10Exeption e) {
            System.out.println("Некорректный входной файл");
        }


    }

    public static void main(String[] args)  {
        printSumDigits(FILE);
    }
}
