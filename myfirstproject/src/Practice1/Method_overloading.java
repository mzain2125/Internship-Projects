package Practice1;

public class Method_overloading {
    static void telljock(){
        System.out.println("What time is it when the clock strikes 13?\n" +
                "Time to get a new clock.");
    }

    static void change(int a){
        System.out.println(a);
    }


    static void change2(int[]arr){
        arr[0]=98;
    }

    //Method Overloading

    static void Fooa(){
        System.out.println("Good Morning Bro");
    }

    static void Fooa(int a){
        System.out.println("Good morning"+ a + "Bro");
    }



    public static void main(String[] args) {
//        telljock();
//        int x=45;
//        change(x);

//        int [] marks={75,98,50,76,67};
//        change2(marks);
//        System.out.println(marks[0]);

        Fooa();
        Fooa(3000);



    }
}
