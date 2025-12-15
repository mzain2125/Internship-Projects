package Polymorphism;

public class Runtime_Poly {
    public static void main(String[] args) {
        Animal obj=new Cat();
        obj.details();

    }
}

class Animal{
    int animalNumber = 10;
    public void details(){
        System.out.println("there are different Animals");
    }
}

class Cat extends Animal{
    public void details(Animal animal){
        super.details();
        System.out.println("Cat hava many colors");
    }
}