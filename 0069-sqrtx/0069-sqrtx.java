class Solution {
    public int mySqrt(int x) {
        long lo=0;
        long hi=x;
        long ans=0;
        while(lo<=hi){
            long mid=(lo+hi)/2;
            if(mid*mid<x){
                lo=mid+1;
                ans=mid;
            }else if(mid*mid>x){
                hi=mid-1;
            }else{
                return (int) mid;
            }
        }
        return (int) ans;
    }
}