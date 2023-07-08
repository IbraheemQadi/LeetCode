// 1207. Unique Number of Occurrences
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        var map = new HashMap<Integer, Integer>();

        for (var num : arr) 
            map.put(num, map.getOrDefault(num, 0) + 1);
        
        var set = new HashSet<Integer>(map.values());

        return set.size() == map.size();
    }
}