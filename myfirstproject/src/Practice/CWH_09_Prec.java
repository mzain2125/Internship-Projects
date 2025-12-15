package Practice;

import java.util.Scanner;
public class CWH_09_Prec {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        //Precedence & Associativity
//        int a=2;
//        int b=0;
//        int c=0;
//        int z= b*b-(4*a*c)/(2*a);
//        System.out.println(z);
//        //Increment & Decrement operators
//        int i= 67;
//        System.out.println(i++);
//        System.out.println(i);
//
//        int y=7;
//        int x= ++y*8;
//        System.out.println(x);
//
//
//        char d='e';
//        System.out.println(++d);
//
//
//        // Grade Quiz
//        char Grade= 'b';
//        Grade= (char)(Grade+8);
//        System.out.println(Grade);
//        Grade= (char)(Grade-8);
//        System.out.println(Grade);

        // Comparison Operator Quiz
        System.out.println("Please Enter A Num");
        int User_Num= Sc.nextInt();
        int GivenNum= 50;
        System.out.println(GivenNum<User_Num);

        int v= 7;
        int u=3;
        int a= 6;
        int s= 3;
        System.out.println((v*v-u*u)/2*a*s);

    }
}
