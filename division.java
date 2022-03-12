// welcome to Quotient and Remainder program

import java.util.Scanner;

public class division {

    public static void main(String[] args) {

        float quotient, remainder;
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter value of dividend and divisor");
        float dividend = scanner1.nextInt();
        float divisor = scanner2.nextInt();
        quotient = dividend / divisor;
        remainder = dividend % divisor;

        System.out.println("value of quotient is : " + quotient);
        System.out.println("value of remainder is : " + remainder);
    }
}
