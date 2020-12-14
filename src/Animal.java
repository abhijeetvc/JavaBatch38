// Inheritance: It is a object-oriented feature where the child class inherits the features of the parent class.
// It is used for code re-usability.
// It is also called as is-a relationship.

// Types of inheritance: a) Single, b) Multi-level, c) Hierarchical, d) Hybrid, e) Multiple
public class Animal {

    public void eat(){
        System.out.println("All animals eat");
    }

    public void run(){
        System.out.println("All animals run");
    }
}

class Dog extends Animal{

    public void bark(){
        System.out.println("All dogs bark");
    }

//    public static void main(String[] args) {
//        Dog d=new Dog();
//        d.bark();
//        d.run();
//        d.eat();
//    }
}

class Puppy extends Dog{

    public void bark1(){
        System.out.println("All puppies bark");
    }

    public static void main(String[] args) {
        Puppy p=new Puppy();
        p.bark1();
        p.bark();
        p.run();
        p.eat();
    }
}

// Program to display patterns:


