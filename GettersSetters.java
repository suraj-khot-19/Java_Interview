class Person{
    private String name;
    private int age;
    //args constructor
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    //    getters and setters
    public void setAge(int age){
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    //bind getters
    void details(){
        System.out.println("name: "+getName()+" age: "+getAge());
    }
}

public class GettersSetters {
    public static void main(String[] args) {
        Person obj=new Person("suraj",24);

        System.out.println(obj.getAge());
        System.out.println(obj.getName());

        //obj.name="adarsh"; //since it is private i cant access or modify
        obj.setAge(25);
        obj.setName("Suraj Khot");
        obj.details();
    }
}
