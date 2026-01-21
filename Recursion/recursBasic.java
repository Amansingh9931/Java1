public class recursBasic{
    public static void printd(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printd(n-1);
    }
    public static void printi(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printi(n-1);
        System.out.print(n+" ");
        
    }
    public static void main(String[] args) {
        int n=10;
        // printd(n);
        printi(n);
    }
} 