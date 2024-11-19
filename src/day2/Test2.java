package day2;

import java.util.Scanner;

public class Test2 {
    private static void numbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println();
        for (int i = a; i <= b; i++){
            if (i % 5 == 0 && i % 10 != 0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
numbers();
    }
}
