/*
  Write a Java programme using the following steps.
  2.1 Declare two static variables
  2.2 Declare one static method
  2.3 Call both static variables into the static method inside the print statement.
  2.4 Declare the Main method.
  2.5 Call the static method into the Main method and Run the programme.
  */
public class Exercise2 {
    static int x = 23;
    static Double y = 50.57;

    public static void method() {
        System.out.println("This is a static method");
        System.out.println("Value of X is: " + x);
        System.out.println("Value of Y is: " + y);
    }

    public static void main(String[] args) {
       method();

    }

}
