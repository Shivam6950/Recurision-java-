public class Recursion10 {
    //check whether given array is strictly increasing or not (1,2,4,6 is allowed) but (1,2,4,6,6 is not allowed)
    public static boolean isSorted(int[] arr, int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx] >= arr[idx + 1]){
            //Unsorted array
            return false;
        }
        return isSorted(arr, idx+1);
    }
    //time complexity = O(n)
    public static void main (String[] args){
        int[] arr={1,2,5,9,9};
        System.out.println(isSorted(arr, 0));
    }
}
