public class ExceptionPrg {

    public static void main(String[] args) {

        int a=5;
        int b[]={10,20,30};
        try {
            int result = a / 1;
            System.out.println("Result is: "+result);
            System.out.println("Array value: "+b[2]);
        }catch (ArithmeticException e){
            System.out.println("Exception handled");
        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("AIOBE handled");
        }finally{
            System.out.println("In finally block");
        }
        System.out.println("Hiiiiiii");
    }
}
