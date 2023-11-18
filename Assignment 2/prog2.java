import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        double d = sc.nextDouble();
        System.out.println(d + " km is "+ d*1000.0 +" meters");
        System.out.println(d + " km is "+ d*3280.8399 +" feet");
        System.out.println(d + " km is "+ d*39370.0787  +" inch");
        System.out.println(d + " km is "+ d*100000 +" cm");        
        sc.close();
    }

}
