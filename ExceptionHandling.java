public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result = 0;
        int[] arr = {1, 2, 3, 4};
        try {
            arr[4] = 5;
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array index out of bound exception");
        } catch (Exception e) {
            System.out.println("something went wrong...");
        }

        System.out.println("end of file");
    }
}
