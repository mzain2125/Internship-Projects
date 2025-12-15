package LMS;
import java.util.Scanner;

public class Teacher extends Login {
    Scanner Sc=new Scanner(System.in);
    int id;
    String name,subject;
    String course[]= new String[5];


    public void teachInfo(){
        System.out.println("Enter Your ID");
        id=Sc.nextInt();
        System.out.println("Enter your Name");
        name=Sc.next();
        System.out.println("Enter Your Teaching Subject");
        subject=Sc.next();
    }
    public void show(){
        System.out.println("Your ID: "+ id);
        System.out.println("Your Name: "+name);
        System.out.println("Your Subject: "+subject);
    }

    public void addCourse(){
        System.out.println("Add Your Course");
        for(int i=0;i<course.length;i++){
            course[i]=Sc.next();
        }
    }
    public void showCourse(){
        System.out.println("Your Courses");
        for(int i=0;i<course.length;i++){
            System.out.println(course[i]);
        }
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        Teacher obj=new Teacher();
        obj.addInfo(1,"zain","zain123");
        obj.showInfo();
        System.out.println("Enter You Choice");
        int choice;
        choice=Sc.nextInt();
        switch (choice){

            case 1:
                obj.teachInfo();
                break;

            case 2:
                obj.show();
                break;

            case 3:
                obj.addCourse();
                break;

            case 4:
                obj.showCourse();
                break;


        }
    }
}