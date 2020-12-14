import java.util.Scanner;

public class SwitchDemo {

    public Integer addNos(int a,int b){
        return a+b;
    }
    public Integer subNos(int a,int b){
        return a-b;
    }
    public Integer multNos(int a,int b){
        return a*b;
    }
    public Integer divNos(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter choice: ");
        int choice=sc.nextInt();

        System.out.println("Enter value for a: ");
        int a=sc.nextInt();
        System.out.println("Enter value for b: ");
        int b=sc.nextInt();

        SwitchDemo sd=new SwitchDemo();
        int result;
        switch(choice){
            case 1:
                result=sd.addNos(a,b);
                System.out.println("Addition is: "+result);
                break;

            case 2:
                result=sd.subNos(a,b);
                System.out.println("Subtraction is: "+result);
                break;

            case 3:
                result=sd.multNos(a,b);
                System.out.println("Multiplication is: "+result);
                break;

            case 4:
                result=sd.divNos(a,b);
                System.out.println("Division is: "+result);
                break;

            default:
                System.out.println("incorrect choice");
                break;
        }

    }
}
