/*
   Write a program for a calculator with addition, subtraction, multiplication and division methods all with parameters
   and use string concatenation methods.(Note: Two static and Two instance methods.)
   */
public class Exercise5 {
    public void addition(int a, int b) {
        int c = a + b;
        System.out.println("Addition is: " + c);
    }

    public void subtraction(int a, int b) {
        int c = a - b;
        System.out.println("Subtraction is: " + c);
    }

    public static void multiplication(int x, int y) {
        int z = x * y;
        System.out.println("Multiplication is: " + z);
    }

    public static void division(int x, int y) {

        int z = x / y;
        System.out.println("Division is: " + z);
    }

    public static void main(String[] args) {

        Exercise5 test = new Exercise5();
        test.addition(50, 10);
        test.subtraction(89, 45);
        multiplication(12, 5);
        division(96, 12);

    }
}
