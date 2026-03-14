package p3_sorting;

public class QuickSort {
    private static void print(int[] nums){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    private static int partition(int[] nums, int start, int end){
        int pivot = nums[end];
        int i = start-1;
        for(int j=0; j<end; j++){
            if(nums[j] < pivot){
                i++;
                int temp = nums[i]; nums[i] = nums[j]; nums[j] = temp;
            }
        }
        int temp = nums[i+1]; nums[i+1] = nums[end]; nums[end] = temp;
        return i+1;
    }
    private static void quickSort(int[] nums, int start, int end){
        if(start < end){
            int pivot = partition(nums,start,end);
            quickSort(nums, start, pivot-1);
            quickSort(nums, pivot+1, end);
        }
    }
    public static void main(String[] args) {
        int[] nums = {4,9,3,6,8};
        quickSort(nums, 0, nums.length-1);
        print(nums);
    }
}
