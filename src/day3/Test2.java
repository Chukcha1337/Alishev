package day3;

import java.util.Scanner;

public class Test2 {
    private static void delenie (double a, double b) {
            System.out.println(a / b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if (b != 0) {
                delenie(a, b);
                continue;
            }
            break;
        }
    }
}
