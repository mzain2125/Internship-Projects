package Practice;

import java.util.Scanner;
public class CWH_ch1_PS {
    public static void main(String[] args) {
        //Question 1
        Scanner Sc= new Scanner(System.in);
//        System.out.println("Enter first Number");
//        int Num1= Sc.nextInt();
//        System.out.println("Enter second Number");
//        int Num2= Sc.nextInt();
//        System.out.println("Enter third Number");
//        int Num3= Sc.nextInt();
//        int Sum= Num1+Num2+Num3;
//        System.out.println(Sum);


        //Question 2 Find CGPA
        System.out.println("Enter subject1 marks with respect to grade");
        float phy= Sc.nextFloat();
        System.out.println("Enter subject1 marks with respect to grade");
        float Math= Sc.nextFloat();
        System.out.println("Enter subject1 marks with respect to grade");
        float Eng= Sc.nextFloat();
        float Credithours= 4;


        float Cradit_GP=(phy*4)+(Math*4)+(Eng*4);
        float addcredit=12;
        float CGPA= Cradit_GP/addcredit;
        System.out.println(CGPA);

//        //Question 3
//        String Name = Sc.next();
//        System.out.println("Hello Your Name "  + Name+ "?");
//
//        // Question 4
//        System.out.println("Give kilometer ");
//        int kilometer= Sc.nextInt();
//        double Onemiles= 0.6213;
//        double kilometer_to_miles= kilometer*Onemiles;
//        System.out.println(kilometer_to_miles);

        // Question 5
//        System.out.println("Enter your Number");
//        System.out.println(Sc.hasNextInt());

        }
}
