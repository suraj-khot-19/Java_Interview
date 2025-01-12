package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Operation {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();

        //insertion
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(2);

        //print
        System.out.println(hashSet);

        //size
        System.out.println("size of hashset: "+hashSet.size());

        //remove
        hashSet.remove(3);
        hashSet.remove(5);

        //contains
        if (hashSet.contains(3)){
            System.out.println("contains 3");
        }else {
            System.out.println("not contains 3");
        }

        //iterator
        Iterator<Integer> i = hashSet.iterator();

        do {
            System.out.println(i.next());
        }while (i.hasNext());
    }
}
