class Solution {
    public void sortColors(int[] nums) {
         var c0 = 0;
        var c1 = 0;
        var c2 = 0;

        var index = 0;

        for (var num : nums) {
            if (num == 0) c0++;

            if (num == 1) c1++;

            if (num == 2) c2++;
        }

        for (int i = 0; i < c0; i++) {
            nums[index++] = 0;
        }
        for (int i = 0; i < c1; i++) {
            nums[index++] = 1;
        }
        for (int i = 0; i < c2; i++) {
            nums[index++] = 2;
        }
    }
}