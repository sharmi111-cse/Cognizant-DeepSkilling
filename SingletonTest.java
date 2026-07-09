public class SingletonTest {

    public static void main(String[] args) {

        // Get the first instance
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");

        // Get the second instance
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

        // Check whether both references point to the same object
        if (logger1 == logger2) {
            System.out.println("\nOnly one Logger instance exists.");
        } else {
            System.out.println("\nMultiple Logger instances exist.");
        }

        // Display object references
        System.out.println("Logger1: " + logger1);
        System.out.println("Logger2: " + logger2);
    }
}