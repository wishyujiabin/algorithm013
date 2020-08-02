// 解法 1:
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}

// 解法 2:
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int target_result = 0;
        Map<Integer, Integer> result_map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            target_result = target - nums[i];
            if (result_map.containsKey(target_result)) {
                return new int[]{ result_map.get(target_result), i};
            }
            result_map.put(nums[i], i);
        }
        return new int[]{};
    }
}