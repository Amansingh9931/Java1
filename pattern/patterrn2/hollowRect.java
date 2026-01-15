public class hollowRect{
    public static void hollow(int tr,int tc) {
        //outer loop
        for(int i=1;i<=tr;i++){
            //inner loop-columns
            for(int j=1;j<=tc;j++){
                //cell - (i,j)
                if(i==1 || i==tr ||j==1 ||j==tc){
                    //boundary cell
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow(4, 5);
    }
}