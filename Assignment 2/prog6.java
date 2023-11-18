import java.util.Scanner;

public class prog6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        double t = sc.nextDouble();
        double d = (1.0/2)*32.174*t*t;
        System.out.println("Distance Travelled: "+d);
        sc.close();
    }
}
