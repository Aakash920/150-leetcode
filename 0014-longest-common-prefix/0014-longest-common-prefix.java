class Solution {
    public String longestCommonPrefix(String[] arr) {
        String s=arr[0];
        int len=s.length();
        for(int i=1 ; i<arr.length ; i++){
            while(arr[i].indexOf(s)!=0){
                s=s.substring(0,s.length()-1);
            }
            if(s.length()==0) return "";
        }
       return s;
    }
}