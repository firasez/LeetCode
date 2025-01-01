import java.util.ArrayList;
import java.util.List;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] list = new int[2];

        for (int i = 0; i< nums.length; i++){
            for (int y = i+1; y<nums.length; y++){
                if(nums[i]+nums[y] == target) {
                    list[0] = i;
                    list[1] = y;
                    return list;
                }
            }

        }
        return list;

    }

    public static void main(String[] args) {
        int[] nums = {11, 3, 7, 2};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]); // Outputs: Indices: 0, 1
    }

}