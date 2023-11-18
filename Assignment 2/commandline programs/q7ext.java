public class q7ext {

    public static void main(String[] args) {
        // Check if three command-line arguments are provided
        if (args.length != 3) {
            System.out.println("Please provide three positive integers as command-line arguments.");
            return; // Exit the program
        }

        // Convert command-line arguments to integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        // Check the condition and print the result
        boolean result = !checkCondition(num1, num2, num3);
        System.out.println(result);
    }

    // Method to check the condition
    private static boolean checkCondition(int a, int b, int c) {
        return (a <= b * c) || (b <= a * c) || (c <= a * b);
    }
}
