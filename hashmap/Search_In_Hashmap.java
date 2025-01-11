package hashmap;

import java.util.HashMap;

public class Search_In_Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        map.put("Suraj",90);
        map.put("santosh",99);

        if (map.containsKey("suraj")){ //case sensitive
            System.out.println("suraj, key is present");
        }else {
            System.out.println("suraj, key is not present");
        }

        //search its value
        System.out.println(map.get("suraj"));
        System.out.println(map.get("Suraj"));
    }
}
/*
suraj, key is not present
null
90
*/