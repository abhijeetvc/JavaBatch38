//Method: It is a block
// Method has: access modifier, return type, method name, block, parameters, return statement

import java.util.Scanner;

public class JavaMethods {

    public void display(){
        System.out.println("in display method");
    }

    public void addNos(){
        int a=20;
        int b=40;
        int result=a+b;
        System.out.println("result: "+result);
    }

    public void addNos1(int a,int b){
        int result=a+b;
        System.out.println("Result is: "+result);
    }

    public int addNos2(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("in main method");

        JavaMethods j=new JavaMethods();
        j.display();
        j.addNos();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for a: ");
        int a=sc.nextInt();
        System.out.println("Enter value for b: ");
        int b=sc.nextInt();

        int total=j.addNos2(a,b);
        System.out.println(total);

    }
}
