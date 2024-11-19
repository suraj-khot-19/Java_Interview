package OOPS;

class Animal1 {
    void sound() {
        System.out.println("animal can make a sound");
    }
}

class Dog1 extends Animal1 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat1 extends Animal1 {
    @Override
    void sound() {
        System.out.println("Cat meow");
    }
}

public class RuntimePoly_MethOverriding {
    public static void main(String[] args) {
        Animal1 animal; //instance of animal

        //1
        animal = new Animal1();
        animal.sound(); //calls animals class sound meth

        //2
        animal = new Dog1();
        animal.sound(); //calls dog class sound meth

        //3
        animal = new Cat1();
        animal.sound(); //calls cats class sound meth
    }
}