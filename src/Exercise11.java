/*
Write a Java program to display the following pattern.
Sample Pattern : J a v v a
                 J a a v v a a
                 J J aaaaa V V aaaaa
                 J J a a V a a
*/
public class Exercise11 {

    char upperJ = 'J';
    char lowerA = 'a';
    char lowerV = 'v';
    char upperV = 'V';

    public void printingMethod() {
        System.out.println(upperJ + "  " + lowerA + " " + lowerV + " " + " " + lowerV + " " + lowerA);
        System.out.println(upperJ + " " + lowerA + " " + lowerA + " " + lowerV + " " + lowerV + " " + lowerA + "" + lowerA);
        System.out.println(upperJ + " " + upperJ + " " + lowerA + "" + lowerA + "" + lowerA + "" + lowerA + "" + lowerA + "  " + upperV + " " + upperV + " " + lowerA + "" + lowerA + "" + lowerA + "" + lowerA + "" + lowerA);
        System.out.println(upperJ + " " + upperJ + " " + lowerA + "   " + lowerA + " " + upperV + " " + lowerA + "   " + lowerA);


    }

    public static void main(String[] args) {
        Exercise11 obj = new Exercise11();
        obj.printingMethod();

    }

}
