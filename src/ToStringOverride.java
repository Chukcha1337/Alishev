public class ToStringOverride {
    private String name;
    private int age;

    public ToStringOverride(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {                             // Мы переопределям метод от клааса Object для нашего класса
        return name + " is " + age + " years old";          // Базово этот метод выводит хэшкод
    }

    public static void main(String[] args) {
        ToStringOverride human = new ToStringOverride("Bob", 40);
        System.out.println(human.toString());
    }
}
