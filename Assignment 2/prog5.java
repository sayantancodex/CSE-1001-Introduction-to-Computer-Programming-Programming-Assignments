import java.util.Scanner;

public class prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of hemisphere: ");
        double r = sc.nextDouble();
        System.out.println("The surface area of the hemisphere is: "+3*Math.PI*r*r );
        System.out.println("The volume area of the hemisphere is: "+(2.0/3)*Math.PI*r*r*r);
        sc.close();
    
    }
}
