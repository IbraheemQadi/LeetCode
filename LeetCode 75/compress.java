// 443. String Compression
class Solution {
    public int compress(char[] chars) {
       if (chars.length == 1) return 1;

        int i = 0, res = 0;
        while (i < chars.length) {
            int groupLength = 1;
            while (groupLength + i < chars.length && chars[i] == chars[i + groupLength])
                groupLength++;

            chars[res++] = chars[i];
            if (groupLength > 1) {
                for (var integer : Integer.toString(groupLength).toCharArray())
                    chars[res++] = integer;
            }

            i = i + groupLength;
        }
        return res;
        
    }
}