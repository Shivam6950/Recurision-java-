public class Recursion3 {
    public static int CalculateFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nm1 = CalculateFactorial(n-1);
        return n*fact_nm1;
    }
    public static void main(String[] args){
        int n=4;
        System.out.println(CalculateFactorial(n));
    }
}
