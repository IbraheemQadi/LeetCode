    // go and see the priority queue soltion
    // how two use functional interface
    // we use the bucket sorting in this question
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // map each element with its count
        Map<Integer, Integer> count = new HashMap<>();
        // array of ArrayLists to make bucket sort
        ArrayList<Integer> buckets[] = new ArrayList[nums.length + 1];

        // start count each element ( element => count )
        for (int num : nums)
            count.put(num, count.getOrDefault(num, 0) + 1);


        for (var element : count.entrySet()) {
            var num = element.getKey();
            var freq = element.getValue();
            if (buckets[freq] == null)
                buckets[freq] = new ArrayList<Integer>();
            buckets[freq].add(num);
        }


      var ret = new int[k];
        var index = 0;

        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
                for (var ele : buckets[i]) {
                    if (index < k) ret[index++] = ele;
                }
            }
        }


        return ret;
        
    }
}