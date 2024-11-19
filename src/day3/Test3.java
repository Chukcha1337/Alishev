package day3;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 5; i++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if (b == 0) {
                System.out.println("Делитель равен нулю");
                i--;
                continue;
            }
            System.out.println(a/b);
        }
    }
}
