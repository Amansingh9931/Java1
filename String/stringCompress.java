public class stringCompress{
    public static String compress(String s){
        String ns="";
        for(int i=0;i<s.length();i++){
            Integer count=1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
            ns +=s.charAt(i);
            if(count>1){
                ns +=count.toString();
            }
        }
        return ns;
    }
    public static void main(String[] args) {
        String s="aaabbcccdd";
        System.out.println(compress(s));
    }
}