// welcome to vowel or consonant program

import java.util.Scanner;

public class vowel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any alphabet");
        char alphabet = scanner.next( ).charAt(0);
        switch (alphabet){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("it is vowel");
                break;
            default:
                if ((alphabet >= 'a' && alphabet <= 'z') || (alphabet >= 'A' && alphabet <= 'Z')){
                    System.out.println("it is a consonant");
                }
                else {
                    System.out.println("please enter alphabet");
                }
        }
    }
}
