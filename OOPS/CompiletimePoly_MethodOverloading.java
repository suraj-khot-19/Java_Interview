package OOPS;

class Calculator {
    int add(int a, int b) {
        System.out.println("method1");
        return a + b;
    }

    int add(int a, double b) {
        System.out.println("method2");
        return a + (int) b;
    }

    double add(double a, double b) {
        System.out.println("method3");
        return a + b;
    }

    double add(double a, int b) {
        System.out.println("method4");
        return a + b;
    }
}

public class CompiletimePoly_MethodOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2, 3));
        System.out.println(c.add(50, 50.0));
        System.out.println(c.add(8.5, 2.5));
        System.out.println(c.add(50.0, 50));
    }
}
