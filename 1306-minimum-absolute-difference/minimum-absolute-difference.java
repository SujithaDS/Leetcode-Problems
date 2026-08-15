class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i =1;i<arr.length;i++){
            int diff = arr[i]-arr[i-1];
            if(diff<min){
                min = diff;
            }
        }
       
        for(int i =1;i<arr.length;i++){
            int diff = arr[i]-arr[i-1];
             if(diff == min){
                 List<Integer> pair = new ArrayList<>();
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                ans.add(pair);
             }
        }
        return ans;
    }
}