package Collection_Interview_Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Iterate_through_hashset {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>(Arrays.asList(1,2,3,4,5,6,8));

        //way 1
        for (Integer integer : hashSet) {
            System.out.println(integer);
        }

        //way2
        Iterator<Integer> i=hashSet.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
