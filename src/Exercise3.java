/*
    Write a Java programme using the following steps.
    3.1 Declare one instance and one static variable.
    3.2 Declare one instance method.
    3.3 Declare one static method.
    3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    3.5 Declare the Main method.
    3.6 Call both instance and static methods into the Main method and run the programme.
    */
public class Exercise3 {

    int x = 12;
    static String name = "John";

    public void method1() {
        System.out.println("This is an instance method calling both instance and static variables");
        System.out.println("Value of X is: " + x);
        System.out.println("Print this name: " + Exercise3.name);

    }

    public static void method2() {
        System.out.println("This is a static method calling both instance and static variables");
        Exercise3 test = new Exercise3();
        System.out.println("Value of X is: " + test.x);
        System.out.println("Print this name: " + name);

    }

    public static void main(String[] args) {
        //Calling an instance method
        Exercise3 test = new Exercise3();
        test.method1();
        //Calling static method
        method2();

    }
}
