interface Student {
    void study();    //abstract method
}

interface Teacher {
    void teach();    //abstract method
}

class School implements Student, Teacher {
    @Override
    public void study() {
        System.out.println("Student study");
    }

    @Override
    public void teach() {
        System.out.println("teacher teach");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        School obj = new School();
        obj.study();
        obj.teach();
    }
}