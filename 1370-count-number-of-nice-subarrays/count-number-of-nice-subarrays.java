class Solution {
    public int numberOfSubarrays(int []nums,int goal){
        return leq(nums,goal)-leq(nums,goal-1);
    }
    public int leq(int[] nums, int goal) {
        if(goal<0)return 0;
        int l=0,r=0,sum=0,c=0;
        while(r<nums.length){
            sum+=nums[r]%2;
            while(sum>goal){
                sum-=nums[l]%2;
                l++;
            }
            c+=(r-l+1);
            r++;
        }
        return c;
    }
}