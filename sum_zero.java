// program to get zero after adding three integer

import java.util.Scanner;

public class sum_zero {

    public static void main(String[] args) {
        int sum = 0, count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter n array values: ");
        int[] array = new int[n];
        for (int i= 0; i < n; i++){
            array[i] = scanner1.nextInt();
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                for (int k = 0; k < n; k++){
                    sum = array[i] + array[j] + array[k];
                    if (sum == 0){
                        System.out.println("triple integer are: " + array[i] + " " + array[j] +" " + array[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println("no of triples  are: " + count);
    }
}
