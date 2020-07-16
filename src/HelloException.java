package src;

import java.util.Scanner;

class HelloException extends Exception {

    public static void main(String[] args) throws HelloException {

        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        if (number2 == 0) throw new HelloException();
        int result = number1 / number2;
        System.out.println(result);
    }
}
