//program to display powers of 2

import java.util.Scanner;

public class power_of_2 {

    public static void main(String[] args) {
        int square = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = scanner.nextInt();
        if (n >0 && n < 31) {
            for (int i = 1; i <= n; i++) {
                square = square * 2;
                System.out.println("2 * " + square + "=" + square * 2);
            }
        }
        else {
            System.out.println("invalid enter");
        }
    }
}
