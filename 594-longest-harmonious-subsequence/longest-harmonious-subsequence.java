class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int max=0;
        for(int n:map.keySet()){
            if(map.containsKey(n+1)){
            int length= map.get(n)+map.get(n+1);
                max = Math.max(max,length);
            }
        }
        return max;
    }
}