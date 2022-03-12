// welcome to prime factor method

import java.util.Scanner;

public class prime_factor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value ");
        int number = scanner.nextInt();

        while (number % 2 == 0){
            System.out.println("2");
            number = number / 2;
        }
        for (int i = 3; i * i <= number; i++){
            while (number % i == 0){
                System.out.println(" " + i);
                number = number / i;
            }
        }
        if (number >2){
            System.out.println(" " + number);
        }
    }
}
