import java.util.ArrayList;
import java.util.Scanner;

public class Read_List_and_Opr_tcs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take string with , as separator
        String s = sc.nextLine();
        System.out.println(subString(s.split(",")));
    }

    // fn which return a list of substring containing word of length greater than 4 and must contain 'ab' in btn them
    public static ArrayList<String> subString(String[] list) {
        ArrayList<String> arrayList=new ArrayList<>();
       for (String x : list){
           if (x.length()>4){
               if (x.contains("ab")){
                  arrayList.add(x);
               }
           }
       }
       return  arrayList;
    }
}