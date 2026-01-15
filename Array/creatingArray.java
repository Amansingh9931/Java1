
import java.util.*;

public class creatingArray{
    public static void main(String[] args) {
        int arra[]=new int[50];
        int no[]={1,2,3,4,5};
        String fr[]={"apple","hor","mango"};

        Scanner sc=new Scanner(System.in);
        arra[0]=sc.nextInt();
        arra[1]=sc.nextInt();
        arra[2]=sc.nextInt();

        System.out.println("Arr length: " + arra.length);
        System.out.println("phy : "+ arra[0]);
        System.out.println("maths : "+ arra[1]);
        System.out.println("sci : "+ arra[2]);

    }
}