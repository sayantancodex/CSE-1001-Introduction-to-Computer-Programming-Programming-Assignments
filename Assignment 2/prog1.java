import java.util.Scanner;
class prog1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a degree in Fahrenheit: ");
        int f = sc.nextInt();
        double c = (f-32.0)*(5.0/9.0);
        System.out.println(f + " Fahrenheit is "+ String.format("%.2f", c) +" Celsius");
        sc.close();
    }
}