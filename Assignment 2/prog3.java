import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary : ");
        double bs = sc.nextDouble();
        double da = bs * 0.4;
        double hra = bs * 0.2;
        double gross = bs + da + hra;
        System.out.println("The Dearness Allowance is: "+da);
        System.out.println("The House rent Allowance is: "+hra);
        System.out.println("The Gross salary is: "+gross);
        sc.close();
    }
}
