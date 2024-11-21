package Patterns;

public class Pyramid {
    public static void main(String[] args) {
        System.out.println("1=>");
        for(int i=6;i>0;i--){
            for (int j=i;j<=6;j++){
                System.out.print('*');
            }
            System.out.println();
        }


        System.out.println("2=>");
        for(int i=0;i<6;i++){
            for (int j=i;j<=6;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
