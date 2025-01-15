public class Recursion7 {

    public static void towerOfHanoi(int n, String src, String helper, String destination ){
        // Base case: If there's only one disk, directly transfer it from source to destination
        if(n==1){
            System.out.println("Transfer disk "+ n + " from "+ src +" to "+destination);
            return;
        }

        // Recursive case:
        // Step 1: Move n-1 disks from the source to the helper peg using destination as an intermediary
        towerOfHanoi(n-1, src, destination, helper);

        // Step 2: Move the nth (largest) disk directly from the source to the destination
        System.out.println("Transfer disk "+ n + " from "+ src +" to "+destination);

        // Step 3: Move the n-1 disks from the helper peg to the destination using the source as an intermediary
        towerOfHanoi(n-1, helper, src, destination);
    }
    //Time complexity =O(2^n)
    public static void main(String[ ] args){
        int n=3; // Number of disks

        // Call the Tower of Hanoi function with:
        // - n disks
        // - "S" as the source peg
        // - "H" as the helper peg
        // - "D" as the destination peg
        towerOfHanoi(n, "S", "H", "D");
    }
}
