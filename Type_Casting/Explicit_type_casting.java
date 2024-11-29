//boolean-byte-1
//short-char-2
//int-float-4
//double-long-8

/*
Explicit type casting==>
conversion of large to small data type
done by programmer
data lost is done
 */
package Type_Casting;

public class Explicit_type_casting {
    public static void main(String[] args) {
        double d=30.50;

        int x=(int) d; //explicit type casting

        System.out.println(d);
        System.out.println(x);
    }
}
