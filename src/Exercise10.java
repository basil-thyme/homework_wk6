import java.util.Scanner;

/*
Write a Java program that takes a number as an input and prints its multiplication table up to 10.
Test Data:
Input a number: 8 Expected Output : 8 x 1 = 8 8 x 2 = 16 8 x 3 = 24 ... 8 x 10 = 80
 */
public class Exercise10 {

    public void multiplicationTable(int table){

        System.out.println("8 x 1 = " + 1* table);
        System.out.println("8 x 2 = " + 2* table);
        System.out.println("8 x 3 = " + 3* table);
        System.out.println("8 x 4 = " + 4* table);
        System.out.println("8 x 5 = " + 5* table);
        System.out.println("8 x 6 = " + 6* table);
        System.out.println("8 x 7 = " + 7* table);
        System.out.println("8 x 8 = " + 8* table);
        System.out.println("8 x 9 = " + 9* table);
        System.out.println("8 x 10 = " +10* table);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int t = sc.nextInt();
        Exercise10 obj = new Exercise10();
        obj.multiplicationTable(t);
        sc.close();

    }



}
