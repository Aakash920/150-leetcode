class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] two=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0 ; i<arr.length ; i++){
            int sum=arr[i];
            if(map.containsKey(target-sum)){
                two[0]=i;
                two[1]=map.get(target-sum);
                return two;
            }
            map.put(sum,i);
        }
        return two;
    }
}