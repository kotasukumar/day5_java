// program to find even or odd

import java.util.Scanner;

public class even_odd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("it is a even number");
        }
        else {
            System.out.println("it is a odd number");
        }
    }
}
