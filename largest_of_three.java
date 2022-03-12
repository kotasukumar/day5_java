//program to find largest of three

import java.util.Scanner;

public class largest_of_three {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter any three numbers: ");
        int number1 = scanner1.nextInt();
        int number2 = scanner1.nextInt();
        int number3 = scanner1.nextInt();
        if (number1 > number2 && number1 > number3){
            System.out.println("largest number is: " + number1);
        }
        else if (number2 >number3){
            System.out.println("largest number is : " + number2);
        }
        else {
            System.out.println("largest number is : " + number3);
        }
    }
}
