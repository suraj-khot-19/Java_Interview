package OOPS;
//abstract class
abstract class Laptop{
    //abstract method
    abstract void compile();

    //concrete method
    void run(){
        System.out.println("Running ...");
    }
}

class Student extends Laptop{
    @Override
    void compile(){
        System.out.println("compiling for student...");
    }
}

class Developer extends Laptop{

    @Override
    void compile() {
        System.out.println("compiling for dev...");
    }
}

public class Abstraction{
    public static void main(String args[]){
        Laptop obj1=new Student();
        obj1.compile(); //abstract method

        Laptop obj2=new Developer();
        obj2.compile();

        obj1.run(); //directly access to concrete method
    }
}
