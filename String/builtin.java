public class builtin{
    public static void main(String[] args) {
        // //compare(Equal)
        // String s="Aura";
        // String s1="BAanana";
        // if(s.equals(s1))System.out.println("got it");
        // else System.out.println("Not");

// //print largest
//         String f[]={"apple","banaba","papaya"};
//         String lar=f[0];
//         for(int  i=1;i<f.length;i++){
//             if(lar.compareTo(f[i])<0){
//                 lar=f[i];
//             }
//         }
//         System.out.println(lar);


        //String Builder
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        //O(26)
        System.out.println(sb+" "+ sb.length());
    }
}