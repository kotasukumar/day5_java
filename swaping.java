// welcome to swaping of two numbers program

public class swaping {

    public static void main(String[] args) {
	int a = 1, b = 2, temporary;
        System.out.println("before swaping value of a and  b are: " + a + "  " + b);
        temporary = b;
        b = a;
        a = temporary;
        System.out.println("after swaping value of a and b are : " + a + "  " + b);
    }
}
