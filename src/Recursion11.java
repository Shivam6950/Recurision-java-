public class Recursion11 {
    //Move all 'x' to the end of the string
    public static void movingToEnd(String str, int idx, int count, String newString){
        if(idx==str.length()){
            for(int i=0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar=='x'){
            count++;
            movingToEnd(str,idx+1, count, newString);
        } else {
            newString += currChar;
            movingToEnd(str,idx+1, count, newString);
        }
    }
    public static void main(String[] args){
        String str="axxbxcxd";
        movingToEnd(str, 0, 0, "");
    }
}
