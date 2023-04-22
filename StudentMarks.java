package StudentList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter Maths marks: ");
        int mathsMarks = scanner.nextInt();

        System.out.print("Enter Science marks: ");
        int scienceMarks = scanner.nextInt();

        System.out.print("Enter Hindi marks: ");
        int hindiMarks = scanner.nextInt();

        // Create Student object and add to ArrayList
        Student student = new Student(mathsMarks, scienceMarks, hindiMarks);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);

        // Sort by Maths marks ascending order
        Collections.sort(students, Comparator.comparing(Student::getMathsMarks));

        System.out.println("Students sorted by Maths marks in ascending order:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by Maths marks descending order
        Collections.sort(students, Comparator.comparing(Student::getMathsMarks).reversed());

        System.out.println("Students sorted by Maths marks in descending order:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
