public class Recursion5 {
    public static int CalculatePower(int x, int n){
        if(n==0){ //Base case 1
            return 1;
        } if(x==0){ //Base case 2
            return 0;
        }
        int Cal_nM1=CalculatePower(x,n-1); //Work
        return x*Cal_nM1;
    }
    public static void main(String[] args){
        System.out.println(CalculatePower(3, 4));
    }
}
