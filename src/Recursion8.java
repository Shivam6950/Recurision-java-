public class Recursion8 {
    public static void printRev(String str, int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }
    //Time complexity = O(n)
    public static void main(String[] args){
        String str="abcd";
        printRev(str, str.length()-1);
    }
}
