package LMS;

public class Login {
    int id;
    String name;
    String email;

    public void addInfo(int id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
    public void showInfo(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(email);
    }
}
