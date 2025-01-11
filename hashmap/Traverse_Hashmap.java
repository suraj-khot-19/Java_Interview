package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Traverse_Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        //insert in hashmap
        map.put("Zoho",90);
        map.put("Suraj",82);
        map.put("Sonya",80);
        map.put("jeeva",45);

        //iterate
        for (Map.Entry<String,Integer> val:map.entrySet()){
            System.out.println(val);
        }

        //iterate through value or keys
        for (Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println("Key: " + e.getKey());
            System.out.println("value: "+e.getValue());
        }
    }
}
