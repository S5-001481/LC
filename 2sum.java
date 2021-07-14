import java.util.HashMap;/*H和M大写*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> inverse = new HashMap<Integer, Integer>();
        for(int i = 0; i< nums.length; i++){
			if(inverse.containsKey(nums[i])){
				return new int[]{i,(inverse.get(nums[i]))}; 	/*new是这个格式*/
			}
			inverse.put((target - nums[i]),i);
		}
		return null;
    }
}
