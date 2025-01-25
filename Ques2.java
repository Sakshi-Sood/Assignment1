package Assignment1;
import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer, a double, a character, and a boolean: ");
        int a = sc.nextInt();
        double b = sc.nextDouble();
        char c = sc.next().charAt(0);
        boolean d = sc.nextBoolean();

        double fromInt = (double) a;
        int fromChar = (int) c;

        System.out.println("Int: " + a);
        System.out.println("Double: " + a);
        System.out.println("Char: " + a);
        System.out.println("Boolean: " + a);
        System.out.println("Int to Double: " + fromInt);
        System.out.println("Char to Int: " + fromChar);
        
        sc.close();
    }
}
