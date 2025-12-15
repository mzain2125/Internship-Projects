package LMS;
import java.util.Scanner;

public class Student extends Login {
    Scanner sc = new Scanner(System.in);
    int id;
    String name;
    String Class;
    String courses[] = new String[5];

    public void addStudentInfo() {
        System.out.println("Enter Student ID: ");
        id = sc.nextInt();

        System.out.println("Enter Student Name: ");
        name = sc.next();

        System.out.println("Enter Student Class: ");
        Class= sc.next();
    }

    public void showStudentInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Class: " + Class);
    }
    public void enrollCourses() {
        System.out.println("Enter 5 Courses:");
        for (int i = 0; i < courses.length; i++) {
            courses[i] = sc.nextLine();
        }
    }
    public void showCourses() {
        System.out.println("Enrolled Courses:");
        for (String c : courses) {
            System.out.println(c);
        }
    }


    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        Student obj=new Student();
        System.out.println("Enter You Choice");
        int choice;
        choice=Sc.nextInt();
        switch (choice){

            case 1:
                obj.addStudentInfo();
                break;

            case 2:
                obj.showStudentInfo();
                break;

            case 3:
                obj.enrollCourses();
                break;

            case 4:
                obj.showCourses();
                break;


        }
    }
}