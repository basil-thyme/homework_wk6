import java.util.Scanner;

/*
Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */
public class Exercise13 {
        public double printAverage(double a, double b, double c) {
        double average = (a + b + c) / 3;
        return average;
        //System.out.println("Average of the entered numbers is: " + average);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double n1 = sc.nextDouble();

        System.out.println("Enter second number: ");
        double n2 = sc.nextDouble();

        System.out.println("Enter third number: ");
        double n3 = sc.nextDouble();
        Exercise13 obj = new Exercise13();
        double result = obj.printAverage(n1, n2, n3);
        //System.out.println("Average of the entered numbers is: " + obj.printAverage(n1, n2, n3));
        System.out.println("Average of the entered numbers is: " + result);
        sc.close();
    }


}
