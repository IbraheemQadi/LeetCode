// 1431. Kids With the Greatest Number of Candies
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = max(candies);
        var list = new ArrayList<Boolean>();
        for (var candie : candies) list.add(candie + extraCandies >= max);

        return list;
    }

    int max(int[] arr) {
        final int[] max = {arr[0]};
        Arrays.stream(arr).forEach(ele -> {
            max[0] = Math.max(ele, max[0]);
        });
        return max[0];
    }
}