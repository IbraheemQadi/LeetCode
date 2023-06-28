// 1768. Merge Strings Alternately
class Solution {
    public String mergeAlternately(String word1, String word2) {
        var m = word1.length();
        var n = word2.length();
        var result = new StringBuilder();

        var i = 0;  // for word1
        var j = 0;  // for word2

        while (i < m || j < n) {
            if (i < m)
                result.append(word1.charAt(i++));
            if (j < n)
                result.append(word2.charAt(j++));
        }

        return new String(result);
    }
}
// ------------------my other sol------------------
class Solution {
    public String mergeAlternately(String word1, String word2) {
        var arr1 = word1.toCharArray();
        var arr2 = word2.toCharArray();
        var ret = new char[word1.length() + word2.length()];

        var i = 0;
        var j = 0; // for ret array

        while (i != word1.length() && i != word2.length()) {
            ret[j++] = arr1[i];
            ret[j++] = arr2[i++];
        }

        if (i == word1.length() && i != word2.length()) {
            while (i != word2.length()) {
                ret[j++] = arr2[i++];
            }
        } else if (i == word2.length() && i != word1.length()) {
            while (i != word1.length()) {
                ret[j++] = arr1[i++];
            }

        }

        return new String(ret);
    }
}
