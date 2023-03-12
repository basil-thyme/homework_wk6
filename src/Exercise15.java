/*
Write a Java program to swap two variables.
*/

import java.util.Scanner;

public class Exercise15 {

    public int swapVariables(int a, int b) {
        a = b;
        b = a;
        int result = a;
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int num1 = sc.nextInt();

        System.out.print("Enter value of b: ");
        int num2 = sc.nextInt();

        Exercise15 obj = new Exercise15();
        obj.swapVariables(num1, num2);
        obj.swapVariables(num2, num1);

        System.out.println("Swapped value of a : " + obj.swapVariables(num1, num2));
        System.out.println("Swapped value of b : " + obj.swapVariables(num2, num1));

        sc.close();

    }
}
