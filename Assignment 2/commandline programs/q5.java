public class q5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int maxab = Math.max(a, b);
        int maxabc = Math.max(maxab,c);
        
        int minab = Math.min(a,b);
        int minabc = Math.min(minab, c);

        int midnum = a+b+c-maxabc-minabc;
        System.out.println(minabc + " "+ midnum +" "+ maxabc);
    }
}
