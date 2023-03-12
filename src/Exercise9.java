/*
    Write a program to convert the upper case to lower case.
    */

import java.util.Scanner;
public class Exercise9 {
    public void toLowerCase(String text) {

        System.out.println("Lowercase : " + text.toLowerCase());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any text: ");
        String text = sc.nextLine();
        Exercise9 obj = new Exercise9();
        obj.toLowerCase(text);
        sc.close();
    }

}
