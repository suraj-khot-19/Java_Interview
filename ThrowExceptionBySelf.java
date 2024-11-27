public class ThrowExceptionBySelf {
    public static void main(String[] args) {
        int a=4;
        int b=5;
        int result=1;

        try{
            result=a/b;
            if(result==0){
                throw new ArithmeticException(); //throwing custom exception
            }
        } catch (ArithmeticException e) {
            System.out.println("Result not be 0");
        } catch (Exception e) {
            System.out.println("something went wrong...");
        }

        System.out.println("end of file");
    }
}
