package Practice;

import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
//        for(int i=0;i<=10;i++){
//            System.out.println(i+" ");
//        }
//        int i=0;
//        while (i<=10){
//            System.out.println(i);
//            i++;
//        }

//        int i=1;
//        do{
//            System.out.println(i);
//            i++;
//        }while (i<0);
//        int sum= 0;
//        for(int i=1;i<=4; i++){
//            sum=sum+i;
//            }
//        System.out.println(sum);

//        int n=Sc.nextInt();
//        int i=1;
//        do{
//            System.out.println(i);
//            i=i+2;
//        }while (i<=n);
//        for(int i=1; i<=n;i=i+2){
//
//            System.out.println(i);
//
//        }

//        for(; ;) {
//            System.out.println("Apna College");
//        }

//        int num= Sc.nextInt();
//        if(num==0){
//            System.out.println("Stop it");
//        }
//        {
//            System.out.println("Enter your Marks");
//            int marks=Sc.nextInt();
//            if(marks>=90){
//                System.out.println("Good Marks");
//            }
//            if(marks<=90 && marks >=80){
//                System.out.println("also good");
//            }
//            else{
//                System.out.println("This is not good");
//            }
//
//        }

//        int n= Sc.nextInt();
//        for(int i=n;i>=0;i--){
//            System.out.println(i);
//        }
//        for(int i=0; i<=10; i++){
//            if(i==5){
//                System.out.println("Ends the loop");
//                break;
//            }
//            System.out.println(i);
//        }
//        int i=0;
//        while (i<=10){
//            i++;
//            if(i==5){
//                System.out.println("continue the Loop");
//                continue;
//            }
//            System.out.println(i);
//
//        }
//        Scanner sc = new Scanner(System.in);
//        int num;
//
//        while(true){
//            System.out.print("Enter number (0 to stop): ");
//            num = sc.nextInt();
//
//            if(num == 0){
//                break;   // stop the loop
//            }
//
//            System.out.println("You entered: " + num);
//        }
//        int n;
//        while (true){
//            System.out.println("Enter the Num o To stop the loop");
//            n= Sc.nextInt();
//
//            if(n<=0){
//                System.out.println("stop the loop");
//                break;
//            }
//            System.out.println("Enterd Num: " +n);
//        }

//        for(int i=0;i <=20; i++){
//            if(i%2==0){
//                continue;
//            }
//            System.out.println(i);
//        }
//        for(int i=1; i<=50;i++){
//            if(i%5==0){
//                continue;
//            }
//            System.out.println(i);
//        }
//        int i=0;
//        while (i<=100){
//            i++;
//            if(i%23==0){
//                break;
//            }
//            System.out.println(i);
//        }
//        for(int i=0; i<=10; i++){
//            if(i==3){
//                continue;
//            }
//            if(i==7){
//                break;
//            }
//            System.out.println(i);
//        }

//        int n=4;
//        for(int i=n;i>=0; i--){
//            for(int j=0;j<1;j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        int k= Sc.nextInt();
        int n=0;
        while (n<=k){
            n=n+2;
            System.out.println(n);
        }

    }
}
