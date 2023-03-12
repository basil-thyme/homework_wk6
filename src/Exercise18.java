import java.util.Scanner;

/*
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data: Input first number: 125 Input second number: 24
Expected Output : 125 + 24 = 149 125 - 24 = 101 125 x 24 = 3000 125 / 24 = 5 125 mod 24 = 5
*/
public class Exercise18 {

    public int addition(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int subtraction(int a, int b) {
        int sub = a - b;
        return sub;

    }

    public int multiplication(int a, int b) {
        int mul = a * b;
        return mul;

    }

    public int division(int a, int b) {
        int div = a / b;
        return div;
    }

    public int modulus(int a, int b) {
        int mod = a % b;
        return mod;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a first number: ");
        int num1 = sc.nextInt();

        System.out.println("Input a first number: ");
        int num2 = sc.nextInt();
        Exercise18 obj = new Exercise18();
        obj.addition(num1, num2);
        obj.subtraction(num1, num2);
        obj.division(num1, num2);
        obj.multiplication(num1, num2);
        obj.modulus(num1, num2);

        System.out.println("Sum of two numbers: " + obj.addition(num1, num2));
        System.out.println("Subtraction of two numbers: " + obj.subtraction(num1, num2));
        System.out.println("Multiplication of two numbers: " + obj.multiplication(num1, num2));
        System.out.println("Division of two numbers: " + obj.division(num1, num2));
        System.out.println("Modulus of two numbers: " + obj.modulus(num1, num2));
        sc.close();


    }
}
