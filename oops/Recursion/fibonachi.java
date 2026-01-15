public class fibonachi{
    public static int fb(int n) {
        // if(n==0)return 0;
        // if(n==1)return 1;
        if(n==0||n==1)return n;
        int fnm1=fb(n-1);
        int fnm2=fb(n-2);
        int fn=fnm1+fnm2;
        return fn;

    }

    public static boolean issorted(int arr[],int i){
        if(i==arr.length-1)return true;
        if(arr[i]>arr[i+1])return false;
        return issorted(arr, i+1);
    }

    public static int firstoccurence(int arr[],int key,int i){
        if(i==arr.length)return -1;
        if(arr[i]==key)return i;
        return firstoccurence(arr,key,i+1);
    }
    public static int lastoccurence(int arr[],int key,int i){
        if(i==arr.length)return -1;
        int isfound=lastoccurence(arr,key,i+1);
        if(isfound==-1 && arr[i]==key)return i;
        return isfound;
    }
    public static void main(String[] args) {
        int arr[]={6,6,6,7,6};
        System.out.println(lastoccurence(arr, 6, 0));
    }
}