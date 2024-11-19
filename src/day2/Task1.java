package day2;

import java.util.Scanner;

public class Task1 {

    private static void measuringHouse (){
        System.out.println("Введите количество этажей: ");
        Scanner sc = new Scanner(System.in);
        int levels = sc.nextInt();

        if (levels >= 1 && levels <= 4)
            System.out.println("Малоэтажный дом");
        else if (levels > 4 && levels <= 8)
            System.out.println("Среднеэтажный дом");
        else if (levels > 8 )
            System.out.println("Многоэтажный дом");
        else
            System.out.println("Ошибка ввода");
    }
    public static void main(String[] args) {
        measuringHouse();


    }
}
