
package Practice1;
import java.util.Scanner;
public class Teacher {
    Scanner sc=new Scanner(System.in);

    String[] names = new String[100];
    int[] ages = new int[100];
    String[] addresses = new String[100];
    int[] rollNumbers = new int[100];
    String[] classes = new String[100];


    int count=0;

    private void addStudent(){

        System.out.println("Enter Student Name: ");
        names[count] = sc.nextLine();

        System.out.println("Enter Student Age: ");
        ages[count] = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Address: ");
        addresses[count] = sc.nextLine();

        System.out.println("Enter Student Roll Number: ");
        rollNumbers[count] = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Class: ");
        classes[count] = sc.nextLine();

        count++;

        System.out.println("Student Added Successfully!");

    }

    private void showStudents() {
        for (int i = 0; i < count; i++) {
            System.out.println(names[i]);
            System.out.println(ages[i]);
            System.out.println(addresses[i]);
            System.out.println(rollNumbers[i]);
            System.out.println(classes[i]);

        }
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        Teacher obj=new Teacher();
        int choice;
        choice=Sc.nextInt();

        switch (choice){
            case 1:
                obj.addStudent();
                break;

        }
        obj.showStudents();

    }
}

