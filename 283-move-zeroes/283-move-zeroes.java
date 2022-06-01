class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
//         [0 1 0 3 12]   =>  1 3 12 0 0
//          i      
        int j = 0;
        
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0) {
                nums[j]=nums[i];
            j++;
            }
        }
        for(int k = j; k<nums.length;k++) nums[k] = 0;
    
}
}