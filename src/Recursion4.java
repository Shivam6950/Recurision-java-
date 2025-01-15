public class Recursion4 {
    //fibonacci series
    public static void PrintFib(int a , int b, int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        PrintFib(b, c, n-1);
    }
    public static void main(String[] args){
        int a=0, b=1, n=10;
        System.out.println(a);
        System.out.println(b);
        PrintFib(a, b, n-2);
    }
}
