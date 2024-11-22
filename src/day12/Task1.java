package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> auto = new ArrayList();
        auto.add("BMW");
        auto.add("Audi");
        auto.add("Porsche");
        auto.add("Ford");
        auto.add("Honda");
        auto.add(2,"Lada");
        auto.remove(0);
        System.out.println(auto);
    }
}
