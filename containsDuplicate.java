class Solution {
    public boolean containsDuplicate(int[] nums) {
            
        var set = new HashSet<Integer>();
        for (var item : nums) {
            if (!set.add(item))
                return true;
        }
        return false;
     
    }
}