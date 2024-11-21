package Interfaces;

public class Test {
    public static void main(String[] args) {
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");
        info1.showInfo();
        info2.showInfo();

        Animal animal = new Animal(2);
        Person person = new Person("Ivan");
        outputInfo(animal);
        outputInfo(person);
    }
    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
