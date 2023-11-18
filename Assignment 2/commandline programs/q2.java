public class q2 {
    public static void main(String[] args) {
        if(args.length !=2){
            System.out.println("Enter two variables.");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println((int)Math.pow(b, a));
    }
    
}
