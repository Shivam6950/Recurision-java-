import java.util.HashSet;
public class Recursion14 {
    //Print all the unique subsequence of a string
    public static void subSequence(String str, int idx, String newString, HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            } else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char CurrChar=str.charAt(idx);
        //To be part of newString
        subSequence(str, idx+1, newString+CurrChar, set);
        //Not to be a part of newString
        subSequence(str, idx+1, newString, set);
    }
    public static void main(String[] args){
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        subSequence(str, 0, "", set);
    }
}
