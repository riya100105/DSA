class Solution {
    public int lengthOfLongestSubstring(String s) {
        int  []arr=new int[256];
        for(int i=0;i<256;i++) arr[i]=-1;
        int n=s.length();
        int l=0,r=0,maxlen=0;
        while(r<n){
            if(arr[s.charAt(r)]!=-1){
                if(arr[s.charAt(r)]>=l){
                    l=arr[s.charAt(r)]+1;
                }
            }
            int len=r-l+1;
            maxlen=Math.max(len,maxlen);
            arr[s.charAt(r)]=r;
            r++;
        }
        return maxlen;
    }
}