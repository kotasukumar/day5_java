// program to find given year is leap year or not

import java.util.Scanner;

public class leap_year {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any year");
        float year = scanner.nextFloat();
        if (year > 999 && year < 10000){
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
                System.out.println("Entered year is leap year");
            }
            else{
                System.out.println("Entered year is not a leap year");
            }
        }
        else {
            System.out.println("enter a valid input");
        }
    }
}
