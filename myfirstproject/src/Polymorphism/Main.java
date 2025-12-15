package Polymorphism;

public class Main {
    public static void main(String[] args) {
//        Compiletime_Poly obj=new Compiletime_Poly();
//        obj.name(4);

//        Printer obj=new Printer();
//        obj.print("Zain");

//        Area obj=new Area();
//        obj.area(2,5l);

//        Display obj=new Display();
//        obj.name();
//        obj.name("Zain","Abdullah");
//        obj.name("Zain","Abdullah","Waqas");

//        Multiplication obj=new Multiplication();
//        obj.multiply(44,55);

//        Addition obj=new Addition();
//        obj.add(new int[]{4, 6});

        login obj=new login();
        obj.login("zain123","Softech@0112");
        obj.login("mzain2125@gmail.com","Softech@0112");
        obj.login(211,11);
    }
}

class login{
    public void login(String a,int b){

        System.out.println("username: "+a+ " password: "+b);
    }
    public void login(String b,String a){

        System.out.println("email: "+b+ " password: "+a);
    }
    public void login(int a,int b){
        System.out.println("phone: "+a+" OTP: "+b);
    }

}



class Addition{
    public void add(int arr[]){
        int sum=0;
        for(int i=0; i< arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}



class Multiplication{
    public void multiply(int a,int b){
        System.out.println(a*b);
    }
    public void multiply(int a,int b,int c){
        System.out.println(a*b*c);
    }
    public void multiply(double a,double b){
        System.out.println(a*b);
    }
}


class Display{
    public void name(){
        System.out.println("zain");
    }
    public void name(String a,String b){
        System.out.println(a+" "+b);
    }
    public void name(String a,String b, String c){
        System.out.println(a+" "+b+" "+c);
    }
}


class Area{
    public void area(float r){
        double pii=3.14;
        System.out.println(pii*(r*r));
    }

    public void area(int l,int w){
        System.out.println("Area of rectangle: "+ l*w);
    }

    public void area(int h,long b){
        System.out.println("Area of triangle: "+ h*b/2);
    }
}


class Printer{
    public void print(int a){
        System.out.println(a);
    }

    public void print(String a){
        System.out.println(a);
    }

    public void print(double a){
        System.out.println(a);

    }
}