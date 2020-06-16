
//  Student Database Application

//  Scenario: You are a Database administrator for a university and need to create an application to manage
//            student enrollments and balance.

//  Your application should do the following:

//  1. Ask the user how many new students will be added to the database.
//  2. The user should be prompted to enter the name and year for each student.
//  3. The student should have a 5-digit unique ID, with the first number being their grade level.
//  4. A student can enroll in the following courses:
//     History 101
//     Mathematics 101
//     English 101
//     Chemistry 101
//     Computer Science 101
//  5. Each course costs $600 to enroll
//  6. The students should be able to view their balance and pay the tuition
//  7. To see the status of the student, we should see their name, ID, course enrolled, and balance.


import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {


        //  Ask how many users we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();

        Student students[] = new Student[numOfStudents];

        //  Create n number of new students
        for (int n=0; n < numOfStudents; n++){

            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }
    }
}
