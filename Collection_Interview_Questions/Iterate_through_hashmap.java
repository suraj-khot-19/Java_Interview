//How do you iterate over the keys and values of a HashMap? Provide code examples.
package Collection_Interview_Questions;

import java.util.HashMap;
import java.util.Map;

public class Iterate_through_hashmap {
    public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<>();

        map.put('s',4);
        map.put('u',3);
        map.put('a',1);
        map.put('t', 2);

        for (Map.Entry<Character,Integer> e: map.entrySet()){
            System.out.println(e.getKey() + " -> "+ e.getValue());
        }

    }
}
