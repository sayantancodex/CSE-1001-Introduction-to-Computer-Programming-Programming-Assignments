/**
 * q1
 */
public class q1 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide two integers as command-line arguments.");
            return; // Exit the program
        }
        int dividend = Integer.parseInt(args[0]);
        int divisor = Integer.parseInt(args[1]);
        System.out.println("Quotient = "+ dividend/divisor);
        System.out.println("Remainder = "+ dividend%divisor);
        

    }
}