class Solution {
    public boolean canConstruct(String r, String m) {
        int [] count=new int[26];
        for(char ch:m.toCharArray())count[ch-'a']++;
        for(char ch:r.toCharArray()){
            count[ch-'a']--;
            if(count[ch-'a']<0)return false;
        }
        return true;
    }
}