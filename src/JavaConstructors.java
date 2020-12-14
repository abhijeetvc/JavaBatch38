//Constructor: Special type of method.
// It is same like your class name
// It does not have the return type
// It has body
// Used for initialisation

public class JavaConstructors {

    int a;
    int b;

    public JavaConstructors(int a, int b) {
        this.a = a;  // this is a keyword in java. It is used to refer to current object.
        this.b = b;
    }

    public int addNos() {
        return a + b;
    }

    public void display() {
        System.out.println("in display method");
    }

    public static void main(String[] args) {
        JavaConstructors j = new JavaConstructors(10, 20);
        j.display();
        System.out.println(j.addNos());
    }
}
