package OOPS;

class Animal {
    void sound() {
        System.out.println("Animal sounds");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog eats food like pedigree");
    }
}

class Cat extends Dog {
    void jump() {
        System.out.println("cat jumps in quick second of time");
    }
}

public class InheritanceMethod {
    public static void main(String[] args) {
        Cat c = new Cat(); //using cat only we can call all func
        c.jump();
        c.eat();
        c.sound();
    }
}