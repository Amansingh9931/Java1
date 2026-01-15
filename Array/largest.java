public class largest{
    public static int getlar(int arr[]){
        int lar=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(lar<arr[i]) {
                lar=arr[i];
            }
            if(small>arr[i]){
                small=arr[i];
            }
        }
        System.out.println("smallest val : " +small);
        return lar;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("Largest no: " + getlar(arr));
    }
}