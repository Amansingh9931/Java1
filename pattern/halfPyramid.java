public class halfPyramid{
    public static void main(String[] args) {
        for(int line=0;line<=4;line++){
            for(int star=1;star<=line;star++){
                System.out.print(star);
            }
            System.out.println();   //next line
        }
    }
}