package leetcode.array;
// Leetcode 01
public class TwoSum {
    public static void main(String[] args) {

    }
    //42MB, 75ms
    public int[] twoSum(int[] nums, int target) {
        int check;
        int[] result = new int[2];

        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                check = nums[i] + nums[j];

                if(check == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
    //44MB, 38ms
    public int[] newtwoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    
}