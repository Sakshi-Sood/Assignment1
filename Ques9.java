package Assignment1;
import java.util.Scanner;
public class Ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter no. of column: ");
        int c = sc.nextInt();

        int matrix[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int maxSum = Integer.MIN_VALUE;
        int row = -1;

        for(int i = 0; i < r; i++){
            int sum = 0;
            for(int j = 0; j < c; j++){
                sum += matrix[i][j];
            }
            if(sum > maxSum){
                maxSum = sum;
                row = i+1;
            }
        }
        System.out.println("Row with the maximum sum: " + row);
        System.out.println("Maximum sum: " + maxSum);

        sc.close();
    }
}
