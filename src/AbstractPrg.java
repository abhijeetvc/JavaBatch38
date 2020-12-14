// Abstract Class: It is an incomplete class.
// We cannot create object of abstract class
// If one of the method of the class is abstract then your class also becomes abstract
// Class can still be abstract even if it does not have abstract method.
// We can have concrete methods inside the class.

public abstract class AbstractPrg {

    abstract void getData();

    public void display(){
        System.out.println("In display method");
    }
}

class CheckAbstract extends AbstractPrg{
    @Override
    void getData() {
        System.out.println("in get data method");
    }

    public static void main(String[] args) {
        CheckAbstract c=new CheckAbstract();
        c.getData();
        c.display();
    }
}