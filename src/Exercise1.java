/*
    Write a Java programme using the following steps.
    1.1 Declare two instance variables.
    1.2 Declare one instance method.
    1.3 Call both instance variables into the instance method inside the print statement.
    1.4 Declare the Main method.
    1.5 Call the above instance method into the Main method and Run the programme.
    */
public class Exercise1 {
    int x = 23;
    float y = 50.2f;
    public void method() {

        System.out.println("This is an instance method");
        System.out.println("Value of X is: " + x);
        System.out.println("Value of Y is: " + y);

    }

    public static void main(String[] args) {
        Exercise1 test = new Exercise1();
        test.method();

    }

}
