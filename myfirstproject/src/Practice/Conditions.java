package Practice;

import java.util.Scanner;
public class Conditions {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
//        int age= 20;
//        if (age >18){
//            System.out.println("you can drive");
//        }
//        else {
//            System.out.println("you cannot drive");
//        }
//
//
//
//        System.out.println("Enter A Num");
//        int num1=Sc.nextInt();
//        int num2=2;
//        int num3=num1%num2;
//        if(num3==0){
//            System.out.println("the num is even");
//        }
//        else{
//            System.out.println(" the num is odd");
//        }

//        System.out.println("Enter Num1");
//        int Num1=Sc.nextInt();
//        System.out.println("Enter Num2");
//        int Num2=Sc.nextInt();
//        System.out.println("Enter Num3");
//        int Num3=Sc.nextInt();
//        if(Num1>Num2 && Num1>Num3){
//            System.out.println("Num1 is Greater");
//        }
//        else if(Num2>Num1 && Num2>Num3){
//            System.out.println("Num2 is Greater");
//
//        }
//        else{
//            System.out.println("Num3 is greater");
//        }

        System.out.println("Enter Num1");
        String Num1= Sc.next();
        switch (Num1){
            case "zain":
                System.out.println("Hi Zain");
                break;
            case "Debruyne":
                System.out.println("Hi De");
                break;
            default:
                System.out.println("Nobody");
        }


    }
}
