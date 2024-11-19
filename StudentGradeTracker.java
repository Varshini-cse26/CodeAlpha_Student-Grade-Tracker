import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        int numStudents = 0;
        int grade;

        System.out.print("Enter the number of students: ");
        numStudents = scanner.nextInt();

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grade = scanner.nextInt();
            grades.add(grade);
        }

        // Calculate average
        int sum = 0;
        for (int grade1 : grades) {
            sum += grade1;
        }
        double average = (double) sum / numStudents;

        // Find highest and lowest
        int highest = grades.get(0);
        int lowest = grades.get(0);
        for (int i = 1; i < numStudents; i++) {
            if (grades.get(i) > highest) {
                highest = grades.get(i);
            }
            if (grades.get(i) < lowest) {
                lowest = grades.get(i);
            }
        }

        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        scanner.close();
    }
}