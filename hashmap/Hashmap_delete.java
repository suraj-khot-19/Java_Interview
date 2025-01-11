package hashmap;

import java.util.HashMap;

public class Hashmap_delete {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        //insert in hashmap
        map.put("Zoho",90);
        map.put("Suraj",82);
        map.put("Sonya",80);

        System.out.println(map);

        map.remove("Sonya");

        System.out.println(map);

        map.remove("khot"); // if no matching with key then no any error

        System.out.println(map);
    }
}
