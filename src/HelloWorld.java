// Variables: Storage area in memory
// Variable Types: a) instance variable, b) local variables, c) class/static variables, d) parameters

public class HelloWorld {

    int x=25; // instance variable
    static int y=30; // class/static variable

    public static void main(String[] args) {
        int a=10;  // local variable
        int b=20;  // local
        int total=a+b;  // local
        System.out.println("Total of a and b is: "+total);

        HelloWorld h=new HelloWorld();
        System.out.println("Value of x: "+h.x);
        System.out.println("Value of y: "+y);
       // System.out.println("Hello Java "+args[0]+" "+args[1]);
    }
}
