package OOP;

class Employee{
    int id;

    public void showDetails(){
        System.out.println("the id is"+ id);
        System.out.println("the name is"+name);
    }

    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}

class Phone{
    public void Method(){
        System.out.println("Phone is ringing");
        System.out.println("Phone is vibrating");
    }
}

class Square{
    int side;
    public int square(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Student{
    String name;
    int marsks;
    public void result(){
        if(marsks>50){
            System.out.println(name+ " Passed the exam");
        }
        else{
            System.out.println("Try next Time");
        }
    }
}

class BankAccount{
    long accountNum;
    int balance;
    int add;
    int withdraw;
    public void Deposite(){
        System.out.println("Balance " +balance);
        System.out.println("Your New Balance "+(balance+add));
    }
    public void withdraw(){
        System.out.println("Balance "+ balance);
        System.out.println("Your Withdraw "+withdraw );
        System.out.println("balance after Withdraw "+ (balance-withdraw));

    }
    public void showBalance(){
        System.out.println(balance);
    }
}

public class Classes_Objects {
    public static void main(String[] args) {
        /*
        Employee obj1=new Employee();
        obj1.salary=240;
        System.out.println(obj1.getSalary());
        obj1.setName("Zain");
        System.out.println(obj1.getName());

        Phone obj=new Phone();
        obj.Method();

        Square sq=new Square();
        sq.side=3;
        System.out.println(sq.square());
        System.out.println(sq.perimeter());


        Student s1=new Student();
        s1.name="zain";
        s1.marsks=70;
        s1.result();
*/

        BankAccount a1=new BankAccount();
        a1.accountNum=444444464445444l;
        a1.balance=4455655;
        a1.add=600;
        a1.withdraw=55555;
        a1.Deposite();
        a1.withdraw();
        a1.showBalance();
    }

}
