class Student {
    private String name;
    private int age;
    private String course;

    // Constructor to initialize student data
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Course: " + course);
    }
}
public class program3
{
    public static void main(String[] args)
    {
        // Create instances of Student
        Student student1 = new Student("HARSHIT", 20, "Computer Science");
        Student student2 = new Student("MAYANK", 22, "Engineering");

        // Display information for both students
        System.out.println("Student 1 Information:");
        student1.displayInfo();
        System.out.println();

        System.out.println("Student 2 Information:");
        student2.displayInfo();
    }
}

