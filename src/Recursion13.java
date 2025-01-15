public class Recursion13 {
    //Print all the subsequence of a string
    public static void subSequence(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char CurrChar=str.charAt(idx);
        //To be part of newString
        subSequence(str, idx+1, newString+CurrChar);
        //Not to be a part of newString
        subSequence(str, idx+1, newString);
    }
    public static void main(String[] args){
        String str="abc";
        subSequence(str, 0, "");
    }
}
