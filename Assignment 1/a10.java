// class a10 {
//     public static void main(String[] args) {
//         String ruler1 = "1";
//         String temp = "";
//         System.out.println(ruler1);
//         for(int i=1; i<=4; i++){
//             if (i==1){
//                 continue;
//             }
//             else{
//                 temp = (ruler1 + i + ruler1);
//                 System.out.println(temp);
//                 ruler1 = temp;
//             } 
            
//         }
//     }
// }

class a10{
    public static void main(String[] args) {
        String ruler1 = " 1 ";
        System.out.println(ruler1);
        ruler1 = ruler1+" 2 "+ruler1;
        System.out.println(ruler1);
        ruler1 = ruler1+" 3 "+ruler1;
        System.out.println(ruler1);
        ruler1 = ruler1+" 4 "+ruler1;
        System.out.println(ruler1);        
    }
}