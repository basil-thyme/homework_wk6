import java.util.Scanner;

/*
Write a Java program to convert a given string into lowercase.
Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG. Output: the quick brown fox jumps over the lazy dog.
 */
public class Exercise19 {

    public static void toLowerCase(String convert) {
        String output = convert.toLowerCase();
        System.out.println("Output: " + output);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Sample Input: ");
        String sample = sc.nextLine();
        toLowerCase(sample);
        sc.close();

    }

}
