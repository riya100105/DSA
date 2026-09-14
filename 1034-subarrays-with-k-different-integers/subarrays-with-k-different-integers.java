class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return hehe(nums,k)-hehe(nums,k-1);
        }
    public int hehe(int[] nums,int k){
        int l=0,r=0,c=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        while(r<nums.length){
            mp.put(nums[r],mp.getOrDefault(nums[r],0)+1);
            while(mp.size()>k){
                mp.put(nums[l],mp.get(nums[l])-1);
                if(mp.get(nums[l])==0)mp.remove(nums[l]);
                l++;
            }
            c+=r-l+1;
            r++;
        }
        return c;
    }
}