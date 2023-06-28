// 136. Single Number
class Solution {
    public int singleNumber(int[] nums) {
        var xor=0;
        for(var num : nums)
            xor ^=num;
        return xor;
    }
}

/*
// another solution
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) return nums[i];
            if (nums[i] != nums[i + 1]) return nums[i];
            else i++;
        }
        return 0;
    }
}
*/

// or you can use hashset if allowed.