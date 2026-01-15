
import java.util.Scanner;

public class matices{
    public static  boolean search(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key) {
                    System.out.println("found at cell ("+ i +"," + j+")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        int m=arr.length,n=arr[0].length;

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        //output
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        search(arr,5);
    }
}