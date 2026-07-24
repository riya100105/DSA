class Solution {
    public int jump(int[] nums) {
        int jumps=0,l=0,r=0;
        int n=nums.length;
        while(r<n-1){
            int f=0;
            for(int j=l;j<=r;j++){
                f=Math.max(nums[j]+j,f);
            }
            l=r+1;
            r=f;
            jumps++;
        }
        return jumps;
    }
}