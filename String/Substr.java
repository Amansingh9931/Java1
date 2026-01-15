public class Substr{
    public static String sub(String st,int si,int e){
        String a="";
        for(int i=si;i<e;i++){
            a+= st.charAt(i);
        }
        return a;
    }
    public static void main(String[] args) {
        String s="HelloWorld";
        System.out.println(sub(s, 0, 5));
    }
}