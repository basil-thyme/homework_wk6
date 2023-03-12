/*
Write a Java program to convert a decimal number to binary number.
Input Data: Input a Decimal Number : 5 Expected Output Binary number is: 101
 */

import java.util.Scanner;

public class Exercise17 {
    public static void convertDecimal(int a) {

        String bin = Integer.toBinaryString(a);
        System.out.println("Expected Output Binary number is: " + bin);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        convertDecimal(num);
        sc.close();
    }
}
