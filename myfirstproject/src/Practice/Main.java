package Practice;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        System.out.println("Hello");
//        int num1= 5;
//        int num2= 7;
//        int num3= 55;
//        int sum = num1 + num2 + num3;
//        System.out.println(sum);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phy Marks");
        int Phy= sc.nextInt();
        System.out.println("Enter Eng Marks");
        int Eng= sc.nextInt();
        System.out.println("Enter math Marks");
        int Math= sc.nextInt();
        System.out.println("Enter total Marks");
        int Total= sc.nextInt();
        double Obtain= Phy+Eng+Math;
        double Per= (float)(Obtain/Total)*100;
        System.out.println(Per);
    }
}
