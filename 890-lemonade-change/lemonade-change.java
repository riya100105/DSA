class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f=0,t=0;
        int n=bills.length;
        for(int i=0;i<n;i++){
            if(bills[i]==5) f++;
            else if(bills[i]==10){
                if(f!=0){
                    f--;
                    t++;
                }
                else{
                    return false;
                }
            }
            else{
                if(t!=0 && f!=0){
                    t--;
                    f--;
                }
                else if(f >=3){
                    f=f-3;
                }
                else {
                    return false;
                }
            }

        }
        return true;
    }
}