package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("src/day15/baseFrom1C.txt");
        Scanner scanner = new Scanner(input);
        File output = new File("src/day15/output.txt");
        PrintWriter pw = new PrintWriter(output);

        while (scanner.hasNextLine()) {
            String[] shoes = scanner.nextLine().split(";");
            if (Integer.parseInt(shoes[2]) == 0)
                pw.print(shoes[0] + ", " + shoes[1] + ", " + shoes[2] + "\n");
        }
        pw.close();
        scanner.close();
    }
}
