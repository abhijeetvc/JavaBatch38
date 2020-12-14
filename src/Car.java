public class Car {

    public void run(){
        System.out.println("All cars run at speed more than 100kmph");
    }

    public void engine(){
        System.out.println("All cars have engine");
    }
}

class Car1{
    public void run(){
        System.out.println("in run of car1");
    }
}
class Audi extends Car{
    public void features(){
        System.out.println("Audi has many features");
    }
}

class Bmw extends Car{

    public void features(){
        System.out.println("Bmw also has good features");
    }
}

class CheckFeatures{
    public static void main(String[] args) {
        Audi a=new Audi();
        a.features();

        Bmw b=new Bmw();
        b.features();
    }
}
