public class Recursion2 {
    public static void PrintSum(int x, int y, int sum){
        if(x==y){
            sum +=x;
            System.out.println(sum);
            return;
        }
        sum += x;
        PrintSum(x+1, y, sum);
    }
    public static void main(String[] args){
        PrintSum(1, 10, 0);
    }
}
