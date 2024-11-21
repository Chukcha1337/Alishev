package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Иван Петров");
        Teacher teacher = new Teacher("Алексей Валерьевич", "Обществознание");
        teacher.evaluate(student);
        Teacher teacher1 = new Teacher("Роман Кимович", "История");
        teacher1.evaluate(student);
    }
}
