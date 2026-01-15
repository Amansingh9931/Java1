public class stairSearch{
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15,},{16,17,18,19,20}};
        int key=14;

        int r=0,c=arr[0].length-1;
        boolean found=false;
        while(r<arr.length && c>=0){
            if(arr[r][c]==key){
                System.out.println("Found key at (" + r +","+c +")");
                found =true;
                break;
            }
            else if(key<arr[r][c]){
                c--;
            }
            else r++;
        }
       if(!found)  System.out.println("Key not found!!");
    }
}