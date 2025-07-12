class person{
    String name = "john";
}

class student extends person{
    String name = "alice";

    void display(){
        System.out.println("Child class name:" + name);
        System.out.println("Parents class name:" + super.name);
    }

}

public class SuperKeyWord {
    public static void main(String[] args) {
        student s= new student();
        s.display();
    }
}
