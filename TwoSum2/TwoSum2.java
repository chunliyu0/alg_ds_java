package TwoSum2;

public class TwoSum2 {
	public int[] twoSum(int[] numbers, int target) {
        int[] rst = new int[2];
        if (numbers == null || numbers.length == 0) {
            return rst;
        }
        int start = 0;
        int end = numbers.length - 1;
        
        while (end >= start) {
            if (numbers[start] + numbers[end] > target) {
                end--;
            } else if (numbers[start] + numbers[end] < target) {
                start++;
            } else {
                rst[0] = start + 1;
                rst[1] = end + 1;
                return rst;
            }
        }
        
        return rst;
    }
	
	/*public static void main(String[] args) {
		int[] nums = {1, 3, 5, 7, 9,10};
		int target = 8;
		
		TwoSum2 so = new TwoSum2();
		int[] rst = so.twoSum(nums, target);
		for (int i = 0; i < 2; i++)
			System.out.print(rst[i]);
	}*/
}
