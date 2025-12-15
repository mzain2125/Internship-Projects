package Practice;

import java.util.Scanner;
public class Methods {

    // a methods that print a massage
    void hello(){
        System.out.println("Hello ");
    }
    // a method that return a Num
    int getnum(){
        return 10;
    }

    //we pass the value inside a method
    void add(int a,int b){
        System.out.println(a+b);
    }

    // Types of Mathods
    // With no return type and no parameters
//    void greet(){
//        System.out.println("Hello!");
//    }

    //Method with parameters but no return
    void Name(String name){
        System.out.println(name);
    }

    //Method with return type + no parameters
    int getage(){
        return 20;
    }

    //Method with return type + parameters
    int age(int a,int b){
        return a+b;
    }

    void name(String name){
        System.out.println(name);
    }

    int larger(int a,int b){
        if (a<b){
            return b;
        }
        else{
            return a;
        }
    }

    // Practice.Even or Odd

    void Evenodd(int a){
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

    int square(int a){
        return a*a;
    }


    void  table(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num*i);
        }
    }



    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        Methods obj=new Methods();
//        int result=obj.larger(Sc.nextInt(), Sc.nextInt());
//        System.out.println(result);
//        obj.Evenodd(20);
//        int sq=obj.square(4);
//        System.out.println(sq);
        obj.table(5);
    }
}
