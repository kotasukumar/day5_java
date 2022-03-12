// welcome to wind chill program

import java.util.Scanner;

public class wind_chill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the value of temperature(t) and velocity (v) ");
        System.out.println("temperature must less then 50 and velocity must in between 3 - 120: ");
        double t = scanner.nextDouble();
        double v = scanner1.nextDouble();
        double w = 35.74 + 0.6215 + (((0.4275 * t) - 35.75) * Math.pow(v, 0.16));
        if (t <= 50 && v > 3 && v < 120) {
            System.out.println("effective temperature is: " + w);
        }
        else{
            System.out.println("values are out of range");
        }
    }
}
