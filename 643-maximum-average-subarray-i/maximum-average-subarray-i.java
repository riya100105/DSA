class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0,r=k,sum=0,maxsum=0;
        for(int i=0;i<k;i++)sum+=nums[i];
        maxsum=sum;
        while(r<nums.length){
            sum-=nums[l];
            sum+=nums[r];
            l++;
            r++;
            maxsum=Math.max(sum,maxsum);
        }
        return (double)maxsum/k;
    }
}