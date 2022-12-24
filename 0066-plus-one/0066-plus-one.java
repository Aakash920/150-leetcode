class Solution {
    public int[] plusOne(int[] arr) {
        int c=0;
        int[] ans=new int[arr.length+1];
        int sum=arr[arr.length-1]+1;
        arr[arr.length-1]=sum%10;
        c=sum/10;
        for(int i=arr.length-2 ; i>=0 ; i--){
            sum=arr[i];
            sum+=c;
            arr[i]=sum%10;
            ans[i]=sum%10;
            c=sum/10;
        }
        
        if(c!=0){
            ans[0]=c;
            return ans;
        }
        return arr;
    }
}