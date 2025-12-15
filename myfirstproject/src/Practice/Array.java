package Practice;

import java.util.Scanner;

class Even{
    public static void Evenodd(int array[]){
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                System.out.println("Num is Practice.Even");
            }
            else{
                System.out.println("Num is Odd");
            }
        }

    }
}
public class Array {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int array[]=new int[5];
        System.out.println("enter 5 num");
        for(int i=0;i<array.length;i++){
            array[i]=Sc.nextInt();

        }
        Even Cl= new Even();
        Even.Evenodd(array);


    }
}
