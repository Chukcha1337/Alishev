package day9;

public class Student extends Human {
    private String group;

    public String getCourse() {
        return group;
    }

    public void setCourse(String group) {
        this.group = group;
    }

    public Student(String name, String group) {
        super(name);
        this.group = group;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Этот студент с именем " + getName());
    }
}
