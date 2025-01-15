public class Recursion15 {
    //Print keypad combination
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void KeypadCombination(String str, int idx, String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar=str.charAt(idx);
        String mapping=keypad[currChar - '0'];
        for(int i=0; i<mapping.length(); i++){
            KeypadCombination(str, idx+1, combination + mapping.charAt(i));
        }
    }
    //time complexity = O(4^n), because we have 4 maximum choices
    public static void main(String[] args){
        String str="23";
        KeypadCombination(str, 0, "");
    }
}
