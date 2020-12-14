import java.util.Scanner;

public class LoopsPrg {

    public static void main(String[] args) {


        // For Loop
//        for(int i=1;i<=10;i++){
//            System.out.println("Print : "+i);
//        }
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num=sc.nextInt();
//        int i=1;
//        for(;i<=num;){
//            System.out.println("Print : "+i);
//            i++;
//        }

        int fact=1;
        for(int x=1;x<=4;x++){
            fact=fact*x;
        }
        System.out.println("Factorial is: "+fact);

        // 1-> 1
        // 2-> 1*2
        // 3-> 1*2*3

        //while Loop
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num=sc.nextInt();
//        int i=1;
//        while(i<=num){
//            System.out.println("Print : "+i);
//            i++;
//        }

        //do-while
        int sum=0, num;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter number: (Y/N)");
            num=sc.nextInt();
            sum=sum+num;
        }while(num!=0);

        System.out.println("Sum is: "+sum);
    }
}
