import java.util.Scanner;

public class HelloException {


    public static void main(String[] args) throws ArithmeticException {
        //System.out.println("Hello World!");

        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if (number2 == 0) {
            System.out.println("Деление на ноль");
            throw new ArithmeticException();
        }
        int result = number1 / number2;
        System.out.println(result);
    }
}
