package Permutations;

import java.util.*;

public class Permutations {
	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        
        if (nums == null || nums.length == 0) {
            return result;
        }
        
        helper(result, set, nums);
        return result;
    }
    
    private void helper(List<List<Integer>> result, List<Integer> set, int[] nums) {
        if (set.size() == nums.length) {
            result.add(new ArrayList<>(set));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                continue;
            set.add(nums[i]);
            helper(result, set, nums);
            set.remove(set.size() - 1);
        }
    }
}
