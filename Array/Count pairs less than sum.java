class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int l =0;
        int r = nums.size()-1;
        int count = 0;
        while(l<r){
            int curr = nums.get(l) + nums.get(r);
            if(curr < target){
                 count+=(r-l);
                l++;
            }
            else{
                r--;
            }
        }
        return count;
    }
}
