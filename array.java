// program to read a 2d array and displayng it

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter no.of rows and columns: ");
        int row = scanner1.nextInt();
        int column = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter elements of array");
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++) {
                array[i][j] = scanner3.nextInt();
            }
        }
        System.out.println("Entered array is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(+array[i][j]);
                System.out.print('\t');
            }
            System.out.println('\n');
        }
    }
}
