package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String lesson;

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int grade = random.nextInt(4) + 2;
        String gradeString = "";
        switch (grade) {
            case 2 -> gradeString = "неудовлетворительно";
            case 3 -> gradeString = "удовлетворительно";
            case 4 -> gradeString = "хорошо";
            case 5 -> gradeString = "отлично";
        }
        System.out.println("Преподаватель "+ name + " оценил студента с именем " + student.getName() + " по предмету " + lesson + " на оценку " + gradeString);
    }
}
