/*
Write a program to insert any temperature value in degree Fahrenheit and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class Exercise7 {
    public static void temperatureConvert(double fahrenheit) {
        double tempCelsius = (((fahrenheit - 32) * 5 / 9));
        System.out.println("Temperature in Celsius : " + tempCelsius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert any temperature value in Fahrenheit: ");
        double temp = sc.nextDouble();
        temperatureConvert(temp);
        sc.close();
    }


}

