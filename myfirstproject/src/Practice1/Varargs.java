package Practice1;

public class Varargs {

    static int sum(int x,int ...arr){
        int result=0;
        for(int a:arr){
            result +=a;
        }
        return result;
    }


    static void table(int x){
        for(int i=1;i<=10;i++){
            System.out.println(x * i);
        }
    }

    //2

    static void pattern(int x){
        for(int i=0;i<=x; i++){
            for(int j=x;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //03

    static int sumRec(int n){
        if(n==1){
            return 1;
        }
          return n+sumRec(n-1);
    }


    static int ave(int...arr){
        int sum=0;
        for(int a:arr){
          sum=sum+a;
        }
        return sum/ arr.length;
    }


    public static void main(String[] args) {


//        table(5);
//        System.out.println(sum(4,5,6,7,8));
//        System.out.println(sum(4,4,4,4));
//        pattern(5);
//        System.out.println(sumRec(3));

        System.out.println(ave(4,40,56));

    }
}
