// welcome to the program to calculate euclidean distance
// formula given sqrt(x*x + y*y)

import java.util.Scanner;

public class distance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the values of x and y: ");
        float x = scanner.nextInt();
        float y = scanner.nextInt();
        float distance = (float) Math.sqrt((x * x) + (y * y));
        System.out.println("euclidean distance is: " + distance);
    }
}
