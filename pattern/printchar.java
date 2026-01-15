public class printchar{
    public static void main(String[] args) {
        char ch='A';
        for(int line=0;line<=4;line++){
            for(int star=1;star<=line;star++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();   //next line
        }
    }
}