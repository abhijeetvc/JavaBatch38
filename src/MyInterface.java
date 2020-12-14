// Interface: It is a special type of class.
// Used for achieving 100% abstraction.
// All the methods in the interface are by default public and abstract
// One interface can extend another interface.
// Class implements interface.

public interface MyInterface {
    void withDraw();
}

interface MyInterface1 {
    void deposit();

    interface MyInterface2{
        void deposit2();
    }
}

class Sbi implements MyInterface1.MyInterface2,MyInterface{

    @Override
    public void withDraw() {
        System.out.println("In withdraw of SBI");
    }

    public void display(){
        System.out.println("In display method");
    }

//    @Override
//    public void deposit() {
//        System.out.println("In deposit of SBI");
//    }

    @Override
    public void deposit2() {
        System.out.println("In deposit2 method");
    }
}

class CheckInterface{
    public static void main(String[] args) {
        MyInterface s=new Sbi();
        s.withDraw();

        MyInterface1.MyInterface2 s1=new Sbi();
        s1.deposit2();

      //  s.display();
    }
}