package hashmap;

import java.util.HashMap;

public class Simple_Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        //insert in hashmap
        map.put("Zoha",90);
        map.put("Suraj",82);
        map.put("Sonya",80);
        map.put("Sonya",45);

        //print they are un-ordered
        //if keys with same name are their then its value is updated
        System.out.println(map); // {Suraj=82, Zoha=90, Sonya=45}
    }
}
