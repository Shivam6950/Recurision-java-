public class Recursion16 {
//Print all permutations of string
    public static void printPerm(String str, String permutation){
        if(str.isEmpty()){
            System.out.println(permutation);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currChar=str.charAt(i);
            //abc -> "ab"
            String newStr=str.substring(0,i) + str.substring(i+1);
            printPerm(newStr, permutation+currChar);
        }
    }
    //time complexity = O(n!)
    public static void main (String[] args){
        String str="abc";
        printPerm(str, "");
    }
}
