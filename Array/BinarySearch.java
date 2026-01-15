public class BinarySearch{
    public static int binary(int arr[],int key) {
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1; 
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8,9,44,21,33};
        int key=11;
        System.out.println("Index for key is : " +binary(arr, key));

    }
}