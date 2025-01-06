package tcs;

public class fibonaci_series {
    public static void main(String[] args) {
        int first=0;
        int secound=1;
        int n=10;
        for (int i=1;i<=n;i++){
            int next=first+secound;
            System.out.println(next+" ");
            first=secound;
            secound=next;
        }
    }
}
