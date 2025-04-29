package B4;

public class Student {
    private String name = "John";
    private String classes = "CO2";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Classes: " + classes);
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Before changing: ");
        student.display();

        student.setName("Mary");
        student.setClasses("CO3");

        System.out.println("After changing");
        student.display();
    }
}
