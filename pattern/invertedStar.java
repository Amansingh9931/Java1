public class invertedStar{
    public static void main(String[] args) {
        for(int line=4;line>=0;line--){
            for(int star=line;star>=1;star--){
                System.out.print("*");
            }
            System.out.println();   //next line
        }
    }
}