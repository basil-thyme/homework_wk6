/*
Write a program to enter any radius value of the circle and find out the area.
(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class Exercise6 {
    public void areaOfCircle(double radius) {
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any radius value: ");
        double rad = sc.nextInt();
        sc.close();
        Exercise6 test = new Exercise6();
        test.areaOfCircle(rad);

    }

}
