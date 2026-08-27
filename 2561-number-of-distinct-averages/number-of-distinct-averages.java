class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        int l=0;
        int r= nums.length -1;
        for(int i=l;i<r;i++){
            int sum = nums[l]+nums[r];
            set.add(sum);
            l++;
            r--;
        }
        return set.size();
    }
}