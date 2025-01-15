public class Recursion6 {
    //Stack height = log n
    public static int CalculatePower(int x, int n){
        if(n==0){ //Base case 1
            return 1;
        } if(x==0){ //Base case 2
            return 0;
        }
        //when n=even
        if(n%2==0){
            return CalculatePower(x, n/2) * CalculatePower(x, n/2);
        }
        //when n=odd
        else{
            return CalculatePower(x, n/2) * CalculatePower(x, n/2) * x;
        }
    }
    public static void main(String[] args){
        System.out.println(CalculatePower(3, 4));
    }
}
