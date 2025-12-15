package Practice;

import java.util.Scanner;
public class CWH_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int a=6;
//        float b= 4.55f;
//        System.out.printf("the percentage of a is %d and percentage of b is %f",a,b);
//        System.out.format("the percentage of a is %d and percentage of b is %f",a,b);

//        String st= sc.nextLine();
//        System.out.println(st.equalsIgnoreCase("debruyne"));

//        Problem 01
        String Sc= "DeBruyne";
        Sc=Sc.toLowerCase();
        System.out.println(Sc);

//        Problem 02
        String Text= "First java program";
        Text=Text.replace("program","Step");
        System.out.println(Text);
    }
}
