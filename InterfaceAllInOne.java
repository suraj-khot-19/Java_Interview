interface Animal {
    //static method
    static void sleep() {
        System.out.println("sleeping ...");
    }

    //abstract method
    void run();

    //default method
    default void eat() {
        System.out.println("eating ...");
    }
}

class Dog implements Animal {
    public void run() {
        System.out.println("dog running...");
    }

    @Override
    public void eat() {     //once we override default method from interface we lost that main content from interface
        System.out.println("Dog is eating...");
    }

    //we can not override static method sleep() from Animal interface
}

public class InterfaceAllInOne {
    public static void main(String args[]) {
        Animal obj = new Dog();
        obj.run();
        obj.eat();

        //static method from animal interface
        Animal.sleep(); //do not require an object creation
    }
}
