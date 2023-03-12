 /*Write a program to calculate the area of a triangle.*/

 import java.util.Scanner;

 public class Exercise8 {
     public static void areaOfTriangle(int height, int base) {
         double area = (height * base) / 2;
         System.out.println("An area of an triangle: " + area);
     }

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value of height: ");
         int height = sc.nextInt();
         System.out.println("Enter the value of base: ");
         int base = sc.nextInt();
         areaOfTriangle(height, base);
         sc.close();
     }

 }
