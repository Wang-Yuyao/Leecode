import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> prevMap = new HashMap<>();
        for (int index= 0; index<nums.length; index++) {
            int diff = target - nums[index];
            if (prevMap.containsKey(diff)) {
               return new int[]{prevMap.get(diff), index};
            }
            prevMap.put(nums[index], index);
        }
        return new int[]{};          
    }
}
