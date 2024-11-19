package day3;

import java.util.Scanner;

public class Test1 {
    private static String countryOf (String town){

        String country = switch (town) {
            case ("Москва"), ("Владивосток"), ("Ростов") -> "Россия";
            case ("Рим"), ("Милан"), ("Турин") -> "Италия";
            case ("Ливерпуль"), ("Манчестер"), ("Ландон") -> "Англия";
            case ("Берлин"), ("Мюнхен"), ("Кёльн") -> "Германия";
            default -> "Неизвестная страна";
        };
        return country;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String town = sc.nextLine();
        System.out.println(countryOf(town));
    }
    }

