import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> resultSet = new HashSet<>();
         resultSet.add(nums[0]);
        for (int index = 1; index < nums.length; index++) {
           if (resultSet.contains(nums[index])) {
            return true;
           } else {
            resultSet.add(nums[index]);
           }
        }
        return false;
    }
}
