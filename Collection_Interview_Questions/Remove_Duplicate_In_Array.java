//Write a Java program to remove duplicate elements from an array using a HashSet.
package Collection_Interview_Questions;
import java.util.Arrays;
import java.util.HashSet;


public class Remove_Duplicate_In_Array {
    public static void main(String[] args) {
        int arr[]={1,1,3,2,4,5,4,3,2,33};

        HashSet<Integer> hashSet=new HashSet<>();

        for (int i=0;i<arr.length;i++){
            hashSet.add(arr[i]);
        }

        System.out.println("Array:"+ Arrays.toString(arr));
        System.out.println("set "+ Arrays.toString(hashSet.toArray()));
    }
}
