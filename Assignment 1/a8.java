public class a8 {
    public static void main(String[] args) {
        int x = 7;
        int y = 99;
        System.out.println("Values before Swap x="+x+" y="+y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("Values After Swap x="+x+" y="+y);

    }
}
