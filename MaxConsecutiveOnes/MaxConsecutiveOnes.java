public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int start = 0, count = 0;
        for(int i = 0; i < nums.length; i++){
            start = i;
            while(i < nums.length && nums[i] == 1){
                i++;
            }
            count = (i - start > count ? i - start: count);
        }
        
        return count;
    }
}
