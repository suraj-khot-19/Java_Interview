package hashmap;

import java.util.HashMap;
import java.util.Set;

public class hashmap_only_keys_print {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        //insert in hashmap
        map.put("Zoho",90);
        map.put("Suraj",82);
        map.put("Sonya",80);

        //creating set of only keys of hashmaps
        Set<String> keys=map.keySet();

        System.out.println(keys); // array set of a keys

        for (String key : keys){
            System.out.println(key);
        }

        //using both
        for (String key : keys){
            System.out.println(key + "-"+ map.get(key));
        }
    }
    /*
    [Suraj, Zoho, Sonya]
    Suraj
    Zoho
    Sonya

    Suraj-82
    Zoho-90
    Sonya-80
    */
}
