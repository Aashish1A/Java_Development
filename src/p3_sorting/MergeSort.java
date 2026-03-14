package p3_sorting;

public class MergeSort {
    private static void print(int[] nums){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    private static void merge(int[] nums, int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1];
        int i = si, j = mid + 1, k = 0;

        while(i <= mid && j <= ei) {
            if(nums[i] <= nums[j]) merged[k++] = nums[i++];
            else merged[k++] = nums[j++];
        }

        while(i <= mid) merged[k++] = nums[i++];
        while(j <= ei) merged[k++] = nums[j++];

        for(int idx = 0; idx < merged.length; idx++) nums[idx+si] = merged[idx];
    }

    private static void mergeSort(int[] nums, int si, int ei) {
        if(si < ei){
            int mid = si + (ei - si)/2;
            mergeSort(nums, si, mid);
            mergeSort(nums, mid + 1, ei);
            merge(nums, si, mid, ei);
        }
    }
    public static void main(String[] args) {
        int[] nums = {4,9,3,6,1};
        mergeSort(nums, 0, nums.length-1);
        print(nums);
    }
}
