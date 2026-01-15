
import java.util.*;

public class if_else{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>13 && a<18) System.out.println("Teenager");
        if(a>=18 && a<=120) System.out.println("adult : eligible to vote");
        else  System.out.println("Not Adult : Not eligible to vote");

    }
}