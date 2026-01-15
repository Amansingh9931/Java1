import java.util.*;
public class interleave2Halves{
    public static void interLeave(Queue<Integer> q){
        Queue<Integer> firstHalve=new LinkedList<>();
        int s=q.size();
        for(int i=0;i<s/2;i++){
            firstHalve.add(q.remove());
        }
        while(!firstHalve.isEmpty()){
            q.add(firstHalve.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interLeave(q);
        //print
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println();
    }
}