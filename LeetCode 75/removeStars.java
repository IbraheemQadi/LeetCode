
// 2390. Removing Stars From a String
// 1st solution without stack
class Solution {
public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') sb.deleteCharAt(sb.length() - 1);
            else sb.append(s.charAt(i));
        }
        System.gc();
        return sb.toString();
    }
}
// 2nd solution with stack
class Solution {
    public String removeStars(String s) {
        var stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                if (!stack.isEmpty()) stack.pop();
            } else stack.push(s.charAt(i));
        }
        
        var ret = new StringBuilder();

        while (!stack.isEmpty()) ret.append(stack.pop());

        return new String(ret.reverse());
    }
}