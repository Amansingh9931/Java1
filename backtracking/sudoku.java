public class sudoku{
    public static boolean issafe(int sudo[][],int r,int c,int digit){
        //column
        for(int i=0;i<=8;i++){
            if(sudo[i][c]==digit){
                return false;
            }
        }
        //row
        for (int i = 0; i <=8; i++) {
            if(sudo[r][i]==digit)return false;
        }

        //grid
        int sr=(r/3)*3;
        int sc=(c/3)*3;
            //3X3 grid
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudo[i][j]==digit)return false;
            }
        }
        return true;
    }

    public static boolean solver(int sudo[][],int r,int c){
        //base
        if(r==9 )return true;

        //recurr
        int nextrow=r,nextcol=c+1;
        if(c+1==9){
            nextrow=r+1;
            nextcol=0;
        }

        if(sudo[r][c]!=0){
            return solver(sudo, nextrow, nextcol);
        }
        for(int digit=1;digit<=9;digit++){
            if(issafe(sudo,r,c,digit)){
                sudo[r][c]=digit;
                if(solver(sudo, nextrow, nextcol))return true;
                sudo[r][c]=0; 
            }
        }
        return false;
    }

    public static void printsudoku(int sudo[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudo[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudo[][]={{0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}};
        if(solver(sudo, 0, 0)){
            System.out.println("Solution exists");
            printsudoku(sudo);
        }
        else{
            System.out.println("solution does not exist");
        }
    }
}