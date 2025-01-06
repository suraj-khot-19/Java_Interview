package tcs;

public class palindrome {
    public static void main(String[] args) {
        String s="suks",reverse="";
        for (int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
        }

        if (reverse.equals(s)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}
