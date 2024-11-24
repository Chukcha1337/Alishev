package day14.Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

    public static List<Person> parseFileToObjList() {
        File file = new File("src/day14/Task2/people");
        List<Person> list = new ArrayList<>();;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] nameAge = line.split(" ");
                int age = Integer.parseInt(nameAge[1]);
                if (age < 0)
                    throw new AgeUnderZero();
                list.add(new Person(nameAge[0], age));
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
        System.out.println(parseFileToObjList());
    }

}


