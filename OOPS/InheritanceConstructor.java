package OOPS;
class Animals{
    public Animals(){
        System.out.println("Animal");
    }
}

class Dogs extends Animals{
    public Dogs(){
        System.out.println("Dog");
    }
}

class Cats extends Dogs{
    public Cats(){
        System.out.println("Cat");
    }
}

public class InheritanceConstructor{
    public static void main(String[] args){
        Cats c=new Cats(); //calls 3 constructors
        //Dogs d=new Dogs(); //calls first 2 constructors
        //Animals a=new Animals(); //calls only animals constructors
    }
}
