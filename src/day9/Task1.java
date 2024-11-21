package day9;

public class Task1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иван Пертович", "Философия");
        Student student = new Student("Коля Петров", "Электроэнергетика");
        System.out.println(teacher.getSubject());
        System.out.println(student.getCourse());
        teacher.printInfo();
        student.printInfo();
    }
}
