/*
Write a Java program to print the area and perimeter of a rectangle.
Test Data: Width = 5.5 Height = 8.5
Expected Output: Area is 5.6 * 8.5 = 47.60 Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.util.Scanner;

public class Exercise14 {

    public static double calculateARea(double width, double height) {
        double area = width * height;
        return area;
    }

    public static double calculatePerimeter(double width, double height) {
        double perimeter = 2 * (width + height);
        return perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a width: ");
        double w = sc.nextDouble();
        System.out.println("Enter a height: ");
        double h = sc.nextDouble();

        calculateARea(w, h);
        calculatePerimeter(w, h);

        System.out.println("An area of an rectangle is: " + calculateARea(w, h));
        System.out.println("Perimeter of a rectangle is: " + calculatePerimeter(w, h));
        sc.close();

    }
}
