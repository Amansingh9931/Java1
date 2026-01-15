import java.util.*;
public  class swapping{
    public static void swap(int a,int b) {
        int temp=a;
        a=b;
        b=temp;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap(a,b);
        System.out.println("a : " +a);
        System.out.println("b : " +b);
        
    }
}