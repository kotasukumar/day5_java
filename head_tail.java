// program to find percentage of head and tail

import java.util.Scanner;

public class head_tail {

    public static void main(String[] args) {
        float head = 0, tail = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no.of times coin to flip");
        float coin = scanner.nextInt();

        for (int i = 1; i <= coin; i++) {
            float flip = (float) (Math.random()) % 2;
            if (coin > 0) {
                if (flip < 0.5) {
                    tail++;
                } else if (flip > 0.5) {
                    head++;
                }
            }
        }
          if (coin <= 0){
                System.out.println("invalid input");
           }
        float head_percentage = (float) (head / coin) *100;
        float tail_percentage = (float) (tail / coin) *100;
        System.out.println("head percentage is : " + head_percentage);
        System.out.println("tail percentage is : " + tail_percentage);
    }
}
