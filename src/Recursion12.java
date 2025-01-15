public class Recursion12 {
    //Remove duplicate from string
    public static boolean[]map=new boolean[26];
    public static void removeDuplicate(String str, int idx, String newstring){
        if(idx==str.length()){
            System.out.println(newstring);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){  //default false case
            removeDuplicate(str, idx+1, newstring);
        } else {
            newstring +=currChar;
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx+1, newstring);
        }
    }
    //Time complexity = O(n)
    public static void main(String[] args){
        String str="abbccda";
        removeDuplicate(str, 0, "");
    }
}
