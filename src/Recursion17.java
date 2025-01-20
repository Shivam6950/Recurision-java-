public class Recursion17 {
    //count total paths in maze to move from (0,0) to (n,m) where n and m are 3
    //Rule only move right and downward is allowed
    public static int countPath(int i, int j, int n, int m){
        if(i==n || j==m){
            return 0;
        } if(i==n-1 && j==m-1){
            return 1;
        }
        //Move Downwards
        int downPaths=countPath(i+1, j, n, m);
        //Move Right
        int right=countPath(i,j+1,n,m);
        return downPaths+right;
    }
    public static void main(String[] args){
        System.out.println(countPath(0,0,4,3));
    }
}
