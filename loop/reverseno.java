import java.util.*;
public  class reverseno{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter the no : ");
        int a=sc.nextInt();
        int rev=0;
        while(a>0){
            int lastd=a%10;
            rev= rev*10 +lastd;
            a=a/10;
        }
        System.out.println(rev);
    }
}