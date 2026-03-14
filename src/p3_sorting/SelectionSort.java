package p3_sorting;

public class SelectionSort {
    private static void print(int[] nums){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {4,9,3,6,2};
        for(int i = 0; i < nums.length - 1; i++) {
            int smallest = i;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] < nums[smallest]) smallest = j;
            }
            int temp = nums[smallest];
            nums[smallest] = nums[i];
            nums[i] = temp;
        }
        print(nums);
    }
}
