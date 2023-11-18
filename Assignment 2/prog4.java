import java.util.Scanner;

/**
 * prog4
 */
public class prog4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 0-1000: ");
        int n = sc.nextInt();
        int sum = 0, d;
        d = n%10;
        n = n/10;
        sum = sum +d;

        d = n%10;
        n = n/10;
        sum = sum+d;
        
        d = n%10;
        n = n/10;
        sum = sum+d;

        System.out.println("The sum is: "+ sum);
        sc.close();
    }
}