
import java.util.*;

public class removeConsequiveSubsequences{
    public static int[] remove(int[] arr){
        int n=arr.length;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            if(s.size()==0 || s.peek()!=arr[i])s.push(arr[i]);
            else if(arr[i]==s.peek()){
                if(i==n-1 || arr[i]!=arr[i+1])s.pop();
            }
        }
        int[] res=new int[s.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i]=s.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int[] res=remove(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}