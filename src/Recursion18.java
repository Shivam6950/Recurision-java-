public class Recursion18 {
    //Place tiles of the size of 1*m in a floor of size n*m, where n=4 and m=2
    public static int placeTiles(int n, int m){
        if(n==m){
            return 2;
        } if(n<m){
            return 1;
        }
        //Vertical alignment
        int verPlacement=placeTiles(n-m, m);
        //Horizontal alignment
        int horPlacement=placeTiles(n-1, m);
        return verPlacement+horPlacement;
    }
    public static void main (String[] args){
        System.out.println(placeTiles(4,2));
    }
}
