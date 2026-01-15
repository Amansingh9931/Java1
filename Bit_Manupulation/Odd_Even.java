public class Odd_Even{
    public static void oddOrEven(int n){
        int bit=1;
        if((n & bit)==0){
            //even
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd Number");
        }
    }

    public static int getIthBit(int n,int i){
        int bit= 1<<i;
        if((n & bit)==0) return 0;
        else return 1;
    }
    public static void main(String[] args) {
        // oddOrEven(3);
        // oddOrEven(8);
    
        System.out.println(getIthBit(10,2));
    }
}