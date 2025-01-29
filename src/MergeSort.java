public class MergeSort {
    public static void conquer(int[] arr, int startingIdx, int mid, int endingIdx){
        int[] merged = new int[endingIdx - startingIdx + 1];
        int idx1=startingIdx;
        int idx2=mid+1;
        int x=0;
        //O(n)
        while(idx1 <= mid && idx2 <= endingIdx ){
            if(arr[idx1] <= arr[idx2]){
                merged[x++]=arr[idx1++];
            } else {
                merged[x++]=arr[idx2++];
            }
        }
        while(idx1 <= mid){
            merged[x++]=arr[idx1++];
        }
        while(idx2 <= endingIdx){
            merged[x++]=arr[idx2++];
        }
        for(int i=0, j=startingIdx; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
    public static void divide(int[] arr, int startingIdx, int endingIdx){
        if(startingIdx >=endingIdx){
            return;
        }
        //O(log n)
        int mid = (startingIdx + endingIdx)/2;
        divide(arr, startingIdx, mid);
        divide(arr, mid+1, endingIdx);
        conquer(arr, startingIdx, mid, endingIdx);
    }
    public static void main(String[] args){
        int[] arr={6,3,9,5,2,8};
        int n= arr.length;
        divide(arr, 0, n-1);
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
//Time complexity = n log(n)
