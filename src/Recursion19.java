public class Recursion19 {
    //Find the number of ways in which you can invite 'n' people to your party, single or in pairs
    public static int CallGuest(int n){
        if(n<=1){
            return 1;
        }
        //Call guest in single
        int ways1=CallGuest(n-1);
        //Call guest in pairs
        int ways2=(n-1)*CallGuest(n-2);
        return ways1+ways2;
    }
    public static void main(String[] args){
        System.out.println(CallGuest(4));
    }
}
