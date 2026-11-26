class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count1 = 0;
        int maxCount = 0;

        for(int i=0; i < nums.length; i++){
            if(nums[i] == 1){
                count1++;
                maxCount = Math.max(maxCount, count1);
            } else {
                count1 = 0;
            }
        }

        return maxCount;

    }
}