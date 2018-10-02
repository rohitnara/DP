/*
Given an array arr[0 … n-1] containing n positive integers, a subsequence of arr[]
is called Bitonic if it is first increasing, then decreasing.

eg: Input arr[] = {80, 60, 30, 40, 20, 10}
Output: 5 (Longest Bitonic Subsequence is 80, 60, 30, 20, 10)
 */
public class BitonicSequence {
    public int longestSequence(int arr[]){
        int lis[] = new int[arr.length];
        int lds[] = new int[arr.length];
        for(int i=0; i < arr.length; i++){
            lis[i] = 1;
            lds[i] = 1;
        }
        for(int i=1 ; i < arr.length; i++){
            for(int j=0; j < i ; j++){
                if(arr[i] > arr[j]){
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }

        for(int i = arr.length-2; i >=0 ; i--){
            for(int j = arr.length-1; j > i; j--){
                if(arr[i] > arr[j]){
                    lds[i] = Math.max(lds[i], lds[j] + 1);
                }
            }
        }
        int max = 0;
        for(int i=0; i < arr.length; i++){
            if(max < lis[i] + lds[i]-1){
                max = lis[i] + lds[i] -1;
            }
        }
        return max;
    }

    public static void main(String args[]){
        BitonicSequence bs = new BitonicSequence();
        int[] arr = {1,4,3,7,2,1,8,11,13,0};
        int r = bs.longestSequence(arr);
        System.out.print(r);

    }
}
