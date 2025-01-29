package Assignment1;
import java.util.Scanner;
public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string1: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the string2: ");
        String str2 = sc.nextLine();

        if(str1.length() != str2.length()){
            System.out.println("false");
            return;
        }

        String str = str1 + str1;
        if(str.contains(str2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        sc.close();
    }
}