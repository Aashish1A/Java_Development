package p3_sorting;

public class BubbleSort {
    private static void print(int[] nums){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {4,9,3,6,1};
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length-1-i; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        print(nums);
    }

}