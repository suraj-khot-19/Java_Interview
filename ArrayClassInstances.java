class ClassMates{
    private int id;
    private String name;
    public ClassMates(int id,String name){
        this.name=name;
        this.id=id;
    }

    //every class extends Object class and toString() method is there in object class, and it is overriding it
    public String toString(){
       return "name: "+name+", id: "+id;
    }
}
public class ArrayClassInstances {
    public static void main(String[] args) {
        ClassMates classMates[]=new ClassMates[3];

        classMates[0]=new ClassMates(1,"suraj");
        classMates[1]=new ClassMates(1,"suraj");
        classMates[2]=new ClassMates(1,"suraj");

        for(ClassMates c : classMates){
            System.out.println(c);
        }
    }
}
