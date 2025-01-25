package Assignment1;
import java.util.Scanner;
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int CartAmount = sc.nextInt();
        int Discount = 0;
        if(CartAmount > 5000)
            Discount = 20;
        else if(CartAmount > 3000 && CartAmount <= 5000)
            Discount = 10;
        else if(CartAmount < 3000)
            Discount = 0;

        double discountAmount = (double)(CartAmount * Discount) / 100;
        double finalAmount = CartAmount - discountAmount;

        System.out.println("Discount: Rs." + discountAmount);
        System.out.println("Final Amount: Rs." + finalAmount);

    }
}
