package day2;

import java.util.Scanner;

public class Task3 {
    private static void numbersWhile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int counter = a;
        while (counter != b) {
            if (counter % 5 == 0 && counter % 10 != 0) {
                System.out.print(counter + " ");
            }
            counter++;
        }
    }
    public static void main(String[] args) {
        numbersWhile();
    }
}