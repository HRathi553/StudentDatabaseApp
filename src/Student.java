import java.util.Scanner;

public class Student {

    private String firstname;
    private String lastname;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //  Constructor: prompt user to enter student's name and year
    public Student(){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter student first name: ");
        this.firstname = in.nextLine();

        System.out.println("Enter student last name");
        this.lastname = in.nextLine();

        System.out.println(" 1 - Freshmen \n 2 - Sophmore \n 3 - Junior \n 4 - Senior \n Enter student class level:");
        this.gradeYear = in.nextInt();

        setStudentID(); // Setting an ID for student

        System.out.println(firstname + " " + lastname + " " + gradeYear + " " + studentID);

        id++;
    }

    //  Generate an ID
    private void setStudentID(){
        //  Grade Level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    //  Enroll in courses
    public void enroll(){
        //  Get inside a loop, user hits 0
        do {
            System.out.println("Enter course to enroll (Q to quit): ");

            Scanner in = new Scanner(System.in);

            String course = in.nextLine();

            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else break;

        }while (true);

        System.out.println("ENROLLED IN: " + courses);
    }

    //  View balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    //  Pay tuition
    public void payTuition(){

        viewBalance();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your payment: ");
        int payment = in.nextInt();

        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gradeYear=" + gradeYear +
                ", studentID='" + studentID + '\'' +
                ", courses='" + courses + '\'' +
                ", tuitionBalance=" + tuitionBalance +
                '}';
    }

    //  Show status
    public String show(){
        return  "\n Name: " + firstname + lastname +
                "\n Grade Level: " + gradeYear +
                "\n Student ID: " + studentID +
                "\n Courses enrolled: " + courses +
                "\n Balance: $" + tuitionBalance;
    }

}
