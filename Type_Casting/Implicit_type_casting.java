//boolean-byte-1
//short-char-2
//int-float-4
//double-long-8

/*
implicit type casting ==>
conversion of small to large data type
automatically done
no data lost
 */
package Type_Casting;

public class Implicit_type_casting {
    public static void main(String[] args) {
        int x=20;

        double d=x; // implicit type casting

        System.out.println(x);
        System.out.println(d);
    }
}
