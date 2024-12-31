/*
unboxing :
 conversion of Integer to int
 conversion of Wrapper to Primitive
 */

package Boxing_Unboxing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class unboxing {
    public static void main(String[] args) {
        Integer i=10;
        int x=i;

        System.out.println(i);
        System.out.println(x);

        // Integer
        List<Integer> list= Arrays.asList(1,2,3,4);
        ArrayList<Integer> arrayList=new ArrayList<>(list);

        int m=list.get(4); //here list having Integer and then it is converted into a int automatically
    }
}
