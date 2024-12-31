
//boxing=> conversion of int to Integer
//boxing=> conversion of primitive to Wrapper

package Boxing_Unboxing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class boxing {
    public static void main(String[] args) {
        int x=10;
        Integer i=x;

        System.out.println(x);
        System.out.println(i);


        // Integer
        List<Integer> list= Arrays.asList(1,2,3,4);
        ArrayList<Integer> arrayList=new ArrayList<>(list);

        // while add(int x) x is converted in wrapper class then it is added
        list.add(3);
        list.add(6);
        list.add(4);
    }
}
