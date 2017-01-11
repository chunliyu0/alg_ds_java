package SearchForARange;

public class SearchForARange {
	public int[] searchRange(int[] nums, int target) {
        int[] rst = new int[2];
        rst[0] = -1;
        rst[1] = -1;
        if (nums == null || nums.length == 0) {
            return rst;
        }
        
        int start = 0;
        int end = nums.length - 1;
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        
        if (nums[start] == target) {
            rst[0] = start;
        } else if (nums[end] == target) {
            rst[0] = end;
        } else {
            return rst;
        }
        
        start = 0;
        end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        
        if (nums[end] == target) {
            rst[1] = end;
        } else if (nums[start] == target) {
            rst[1] = start;
        }
        
        return rst;
    }
	
	/*public static void main(String[] args) {
		int[] input = {-5,-4,-3,-3, 1,1,1,3,4,5,5,5,6,7,7,8};
		int target = 1;
		
		SearchForARange solution = new SearchForARange();
		
		int[] result = solution.searchRange(input, target);
		
		System.out.print(result[0] + " ");
		System.out.print(result[1]);
	}*/
}
