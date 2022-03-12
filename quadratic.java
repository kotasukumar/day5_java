// program to find the square root of quadratic expression ax^2 + bx +c

import java.util.Scanner;

public class quadratic {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter the value of a, b and c: ");
        double a = scanner1.nextInt();
        double b = scanner2.nextInt();
        double c = scanner3.nextInt();
        double delta, root1, root2;
         delta = (b * b) - (4 * a * c);
         root1 =  ((- b) + (Math.sqrt(delta))) / (2 * a);
         root2 =  ((- b) - (Math.sqrt(delta))) / (2 * a);
         if (root1 >0 || root1 < 0 || root2 >0 || root2 < 0) {
             System.out.println("square root of given quadratic are: " + root1 + " or " + root2);
         }
         else {
             System.out.println("imaginary root");
         }
    }
}
