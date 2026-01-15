public class lowerUpperBound{
    public static void main(String[] args) {
        int[] arr={10,23,46,46,91,97,97,130,233};
        int n=arr.length;
        int target=46;
        int lb=n,lo=0,hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            //if(arr[mid]>=target){   //lower bound
            if(arr[mid]>target){   //upper bound
                lb=Math.min(lb,mid);
                hi=mid-1;
            }
            else lo=mid+1;
        }
        System.out.println(lb);
    }
}