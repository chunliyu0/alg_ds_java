package ThreeSum;

import java.util.*;

public class ThreeSum {
	 public List<List<Integer>> threeSum(int[] nums) {
	        List<List<Integer>> rst = new ArrayList<>();
	        if (nums == null || nums.length == 0) {
	            return rst;
	        }
	        
	        Arrays.sort(nums);
	        
	        for (int i = 0; i < nums.length; i++) {
	            if (i != 0 && nums[i] == nums[i - 1]) {
	                continue;
	            }
	            int target = 0 - nums[i];
	            int start = i + 1;
	            int end = nums.length - 1;
	            while (start < end) {
	                if (nums[start] + nums[end] < target) {
	                    start++;
	                } else if (nums[start] + nums[end] > target) {
	                    end--;
	                } else {
	                    List<Integer> set = new ArrayList<>();
	                    set.add(nums[i]);
	                    set.add(nums[start]);
	                    set.add(nums[end]);
	                    rst.add(set);
	                    start++;
	                    end--;
	                    while (start < end && nums[start] == nums[start - 1])
	                        start++;
	                    while (start < end && nums[end] == nums[end + 1])
	                        end--;
	                }
	            }
	        }
	        return rst;
	    }
	 
	 /*public static void main(String[] args) {
		 ThreeSum solution = new ThreeSum();
		 int[] input = {-1, -4, -2, 0, 1, 2};
		 List<List<Integer>> rst = solution.threeSum(input);
		 for (List<Integer> i : rst) {
			 for (int j : i) {
				 System.out.print(j + " ");
			 }
			 System.out.println();
		 }
	 }*/
}
