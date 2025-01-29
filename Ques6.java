package Assignment1;
import java.util.Scanner;
public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        
        String words[] = s.split(" ");
        String longest = "";

        for(String word : words){
            if(word.length() > longest.length()){
                longest = word;
            }
        }
        System.out.println("Longest word in the string is: " + longest);
    }    
}
