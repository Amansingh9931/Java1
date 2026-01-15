public class permutation{
    public static void per(String str,String ans){
        //base
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //kaam or recurrsion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            per(newstr,ans+curr);
        }
    }
    
    public static void main(String[] args) {
        String str="abc";
        per(str, "");
    }
}