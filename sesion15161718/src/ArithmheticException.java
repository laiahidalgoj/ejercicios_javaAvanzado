public class ArithmheticException extends Throwable {

    public static void main(String[] args) throws ArithmheticException {

        System.out.println(divideByZero(8,0));

    }

    public static int divideByZero(int a, int b) throws ArithmheticException {
        int result = 0;

        try {
            result = a / b;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("this operation cannot be performed");
        }
        return result;
    }
}
