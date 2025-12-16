package OOP;

class AccessModifiers{
    private String a;
    private int b;

    public void setA(String a1){
        a=a1;
    }
    public String getA(){
        return a;
    }

    public void setB(int b1){
        b=b1;
    }
    public int getB(){
        return b;
    }
}

public class Getter_Setter {
    public static void main(String[] args) {

        AccessModifiers s1=new AccessModifiers();
        s1.setA("zain");
        System.out.println(s1.getA());
        s1.setB(24);
        System.out.println(s1.getB());
    }
}
