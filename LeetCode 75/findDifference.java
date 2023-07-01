// Find the Difference of Two Arrays
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();

        var set1 = new HashSet<Integer>();
        var set2 = new HashSet<Integer>();

        addToSet(set1, nums1);
        addToSet(set2, nums2);

        set1.removeAll(set2);
        answer.add(new ArrayList<>(set1));

        addToSet(set1, nums1);
        set2.removeAll(set1);
        answer.add(new ArrayList<>(set2));

        return answer;
    }

    private void addToSet(Set<Integer> set, int[] arr) {
        for (var i : arr)
            set.add(i);
    }
}