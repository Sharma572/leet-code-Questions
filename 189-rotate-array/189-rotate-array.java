class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
//   [1,2,3,4,5,6,7], k = 3
//    this first funtion reverse whole array => 7 6 5 4 3 2 1
        reverse(nums,0 ,nums.length-1);
//         This will reverse 0 index to 2 index => 5 6 7 4 3 2 1
         reverse(nums,0 ,k-1);
//         this will reverse from k to index => 5 6 7 1 2 3 4 
        reverse(nums,k , nums.length-1);
   
    }
    public void reverse(int []nums, int start,int end){
        
        while(start < end){
            int temp = nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;
        }
    }
}