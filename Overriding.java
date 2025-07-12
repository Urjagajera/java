class A{
    void method1(){
        System.out.println("This is class A");
    }
}

class B extends A{
    @Override
    void method1(){
        System.out.println("This is class B");
    }
}

public class Overriding {
    public static void main(String[] args) {
        A a = new B();
        a.method1();
    }
}
