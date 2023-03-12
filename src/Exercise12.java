import java.util.Scanner;

/*
Write a Java program to compute the specified expressions and print the output.
Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) Expected Output : 2.138888888888889
*/
public class Exercise12 {

    public static void computeNumbers(double a, double b, double c, double d, double e, double f) {
        double data = ((a * b - c * d) / (e - f));
        System.out.println(data);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of a: ");
        double n1 = sc.nextDouble();

        System.out.println("Enter a value of b: ");
        double n2 = sc.nextDouble();

        System.out.println("Enter a value of c: ");
        double n3 = sc.nextDouble();

        System.out.println("Enter a value of d: ");
        double n4 = sc.nextDouble();

        System.out.println("Enter a value of e: ");
        double n5 = sc.nextDouble();

        System.out.println("Enter a value of d: ");
        double n6 = sc.nextDouble();

        computeNumbers(n1, n2, n3, n4, n5, n6);
        sc.close();
    }

}
