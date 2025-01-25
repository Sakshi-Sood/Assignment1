package Assignment1;
import java.util.Scanner;
public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        double income = sc.nextDouble();

        System.out.print("Do you have pending dues? (true/false)");
        boolean pendingDues = sc.nextBoolean();
        
        boolean condition = (age >= 18 && income >= 30000 && !pendingDues);
        System.out.println(condition?"You are eligible for premium membership." : "You are not eligible for premium membership.");
    }
    
}
