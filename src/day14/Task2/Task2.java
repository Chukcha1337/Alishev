package day14.Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {



    public static List<String> parseFileToStringList() {


        try {
            File file = new File("src/day14/Task2/people");
            Scanner scanner = new Scanner(file);
            List<String> list = new ArrayList<>();
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                String[] human = line.split(" ");

                if (Integer.parseInt(human[1]) < 0)
                    throw new AgeUnderZero();

                list.add(line);
            }
            scanner.close();
            return list;

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (AgeUnderZero e) {
            System.out.println("Некорректный входной файл");

        }
            return null;
    }

    public static void main(String[] args) {
        System.out.println(parseFileToStringList());
    }

}
