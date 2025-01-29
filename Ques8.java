package Assignment1;
import java.util.Scanner;
public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int reverse = 0;
        while(N != 0) {
            int digit = N % 10;
            reverse = reverse * 10 + digit;
            N /= 10;
        }
        System.out.println(reverse);
    }
}
