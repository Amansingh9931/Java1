
import java.util.Stack;



public class MaxAreaHistogram{
    public static void maxArea(int h[]){
        int maxA=0;
        int nsr[]=new int[h.length];
        int nsl[]=new int[h.length];


        //next smaller right
        Stack<Integer> s=new Stack<>();
        for(int i=h.length-1;i>=0;i--){
            while(!s.isEmpty() && h[s.peek()]>=h[i]){
                s.pop();
            }
            if(s.isEmpty()){
                //-1
                nsr[i]=h.length;
            }
            else{
                //top
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        //next smaller left
        s=new Stack<>();
        for(int i=0; i<h.length;i++){
            while(!s.isEmpty() && h[s.peek()]>=h[i]){
                s.pop();
            }
            if(s.isEmpty()){
                //-1
                nsl[i]=-1;
            }
            else{
                //top
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //current Area = width=j-i-1=nsr[i]-nsl[i]-1
        for(int i=0;i<h.length;i++){
            int height=h[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            maxA=Math.max(currArea,maxA);
        }

        System.out.println("Max area in histogram is: "+maxA);


    }
    public static void main(String[] args) {
        int h[]={2,1,5,6,2,3};
        maxArea(h);
    }
}