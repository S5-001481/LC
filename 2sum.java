import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> inverse = new HashMap<Integer, Integer>();
        for(int i = 0; i< nums.length; i++){
			if(inverse.containsKey(nums[i])){
				int[] ans = new int[2];
				ans[0] = i;
				ans[1] = inverse.get(nums[i]);
				return ans;
			}
			inverse.put((target - nums[i]),i);
		}
		return null;
    }
}
