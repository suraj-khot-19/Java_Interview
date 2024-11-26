abstract class Computer {
    abstract void compile();
}

class Desktop extends Computer {
    @Override
    void compile() {
        System.out.println("compiling faster ...");
    }
}

class Laptop extends Computer {
    @Override
    void compile() {
        System.out.println("Compiling slower...");
    }
}

class Dev {
    void run(Computer com) {
        com.compile();
    }
}

public class DevelopersWantLapDesk {
    public static void main(String[] args) {
        Computer desk = new Desktop();
        Computer lap = new Laptop();

        Dev dev = new Dev();
        dev.run(desk); //passing desktop
        dev.run(lap); //passing laptop
    }
}
