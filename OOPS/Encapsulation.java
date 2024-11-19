package OOPS;
class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if(age<0){
            System.out.println("Age must greter than zero");
        }
        else{
            this.age=age;
        }
    }

    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }

    void details(){
        System.out.println("name : "+getName()+", age : "+getAge());
    }
}

public class Encapsulation{
    public static void main(String[] args){
        Person p=new Person("suraj",24);
        p.details();

        p.setName("Rowdy");
        p.setAge(22);
        p.details();
    }
}