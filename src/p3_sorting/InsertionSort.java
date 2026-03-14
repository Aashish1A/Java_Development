package p3_sorting;

public class InsertionSort {
    private static void print(int[] nums){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {4,9,3,6,8};
        for(int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int j = i - 1;
            while(j >=0 && current < nums[j]){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = current;
        }
        print(nums);
    }
}
