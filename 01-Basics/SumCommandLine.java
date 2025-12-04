public class SumCommandLine {
    public static void main(String[] args) {
        // Check if two arguments are passed
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }

        // Parse the arguments
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Calculate sum
        int sum = num1 + num2;

        // Display result
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
