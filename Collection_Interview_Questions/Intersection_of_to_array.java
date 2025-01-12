package Collection_Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Intersection_of_to_array {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,3,2};
        int arr2[]={6,7,5,4,3,77};

        HashSet<Integer> hashSet=new HashSet<>();
        ArrayList<Integer> arrayList=new ArrayList<>();


        for (int i=0;i<arr1.length;i++){
            hashSet.add(arr1[i]);
        }

        for (int i=0;i<arr2.length;i++){
            if(hashSet.contains(arr2[i])){
               arrayList.add(arr2[i]);
            }
        }
        System.out.println(arrayList);
    }

}
