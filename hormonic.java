// welcome to harmonic program

import java.util.Scanner;

public class hormonic {

    public static void main(String[] args) {
        float harmonic = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = scanner.nextInt();
        if (n !=0) {
            for (float i = 1; i <= n; i++) {
                harmonic = harmonic + (1 / i);
            }
        }
        else {
            System.out.println("Entered value is invalid");
        }
        System.out.println( + n + "th harmonic number is: " + harmonic);
    }
}
