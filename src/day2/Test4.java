package day2;

import java.util.Scanner;

public class Test4 {
    private static void uravnenie (){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;
        if (x >= 5)
            y = ((Math.pow(x,2)-10)/(x + 7));
        else if (x > -3 && x < 5)
            y = ((x+3)*((Math.pow(x,2)-2)));
        else
            y = 420;
        System.out.println(y);
    }

    public static void main(String[] args) {
        uravnenie();
    }
}
