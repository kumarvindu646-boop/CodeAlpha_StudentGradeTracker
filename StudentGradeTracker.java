import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine(); 
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            students.add(new Student(name, marks));
        }

        int total = 0, highest = Integer.MIN_VALUE, lowest = Integer.MAX_VALUE;

        for (Student s : students) {
            total += s.marks;
            if (s.marks > highest) highest = s.marks;
            if (s.marks < lowest) lowest = s.marks;
        }

        double average = (double) total / students.size();

        System.out.println("\n--- Student Report ---");
        for (Student s : students) {
            System.out.println(s.name + " : " + s.marks);
        }

        System.out.println("\nAverage: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
    }
}