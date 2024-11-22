package Lessons.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
       List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(9));
        System.out.println(arrayList.size());


        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        for(Integer i:arrayList){
            System.out.println(i);
        }

        arrayList.remove(5);
        System.out.println(arrayList);
    }
}
