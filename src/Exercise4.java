/*
Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
*/
public class Exercise4 {
    String name = "Paul";
    Double myNum = 44.12;

    static char myLetter = 'P';
    static float x = 4.45f;

    public void method1() {

        System.out.println("This is an instance method");
        System.out.println("My name is: " + name);
        System.out.println("My number value is: " + myNum);
        System.out.println("My name starts with letter: " + Exercise4.myLetter);
        System.out.println("My number value is: " + Exercise4.x);
    }

    public static void method2() {

        System.out.println("This is a static method");
        Exercise4 test = new Exercise4();
        System.out.println("My name is: " + test.name);
        System.out.println("My number value is: " + test.myNum);
        System.out.println("My name starts with letter: " + Exercise4.myLetter);
        System.out.println("My number value is: " + Exercise4.x);

    }

    public static void main(String[] args) {

        Exercise4 test = new Exercise4();
        test.method1();
        method2();


    }


}
