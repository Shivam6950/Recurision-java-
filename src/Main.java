public class Main {
    public static void printNumb(int n){
        //Base case
        if(n==6){
            return;
        }
        System.out.println(n);
        printNumb(n+1); //Recursion
    }
    public static void main (String[] args){
        int n=1;
        printNumb(n);
    }
}
