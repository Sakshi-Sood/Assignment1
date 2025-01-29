package Assignment1;
import java.util.Scanner;

class Student{
    String name;
    int rollNo;
    float marks;

    public Student(String name, int rollNo, float marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNo + ", Marks: " + marks);
    }

    public void updateMarks(float marks){
        this.marks = marks;
    }
    public void updateMarks(int percentage){
        this.marks = marks + (marks*percentage/100);
    }

}
public class Ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Student details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        
        System.out.print("Roll Number: ");
        int roll = sc.nextInt();
        
        System.out.print("Marks: ");
        float marks = sc.nextFloat();
        
        Student s = new Student(name,roll,marks);

        System.out.println("Update marks:");
        System.out.print("New Marks: ");
        float newMarks = sc.nextFloat();
        s.updateMarks(newMarks);
        System.out.print("Updated Details: ");
        s.displayDetails(); 
        
        System.out.println("Update marks by percentage increase: ");
        System.out.print("Percentage: ");
        int percentage = sc.nextInt();
        System.out.print("Updated Details: ");
        s.updateMarks(percentage);
        s.displayDetails(); 
        

    }
}
