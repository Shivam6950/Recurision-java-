import java.util.ArrayList;

public class Recursion20 {
    //Print all the subsets of a set of first n natural numbers
    public static void printSubset(ArrayList<Integer> subset){
        for (Integer integer : subset) { //another method is for(int i=0; i<subset.size(); i++)
            System.out.print(integer + " ");
        }
        System.out.println();
    }
    public static void findSubsets(int n, ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }

        //If element adds
        subset.add(n);
        findSubsets(n-1, subset);

        //If number don't add
        subset.removeLast(); //another method for calling this function is subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }
    //time complexity is O(2^n)
    public static void main(String[] args){
        ArrayList<Integer> subset=new ArrayList<>();
        findSubsets(3, subset);
    }
}
