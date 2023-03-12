/*
Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output: Sum of two binary numbers: 101
*/

import java.util.Scanner;

public class Exercise16 {

    public static void binaryAddition(int a, int b) {
        int a1 = (int) a;
        int b1 = (int) b;
        String s1 = Integer.toString(a1);
        String s2 = Integer.toString(b1);
        int num0 = Integer.parseInt(s1, 2);
        int num1 = Integer.parseInt(s2, 2);
        int sum = num0 + num1;
        String s3 = Integer.toBinaryString(sum);
        System.out.println("Sum of two binary numbers: " + s3);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first binary number: ");
        int binary1 = sc.nextInt();
        System.out.println("Enter second binary number: ");
        int binary2 = sc.nextInt();
        sc.close();
        binaryAddition(binary1, binary2);

    }

}
