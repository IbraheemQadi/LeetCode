// 151. Reverse Words in a String
// sol 1 , with O(1) space
class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        s = s.trim();
        int n = s.length();
        int i = 0;

        while(i <n) {
            while(i<n && s.charAt(i) == ' ' ) {
                i++;
            }
            int start = i;
            while(i <n && s.charAt(i) != ' ') {
                i++;
            }
            int end = i;
            result.insert(0, s.substring(start, end) + " ");            
        }

        return result.toString().trim();
        
    }
}
// sol 2 , with O(N) space
class Solution {
    public String reverseWords(String s) {
        var list = new ArrayList<StringBuilder>();

        for (var i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (list.isEmpty()) {
                    list.add(new StringBuilder());
                    list.get(list.size() - 1).append(s.charAt(i));
                } else if (s.charAt(i - 1) != ' ')
                    list.get(list.size() - 1).append(s.charAt(i));
                else {
                    list.add(new StringBuilder());
                    list.get(list.size() - 1).append(s.charAt(i));
                }
            }
        }
        
        String ret = "";
        for (var i = list.size() - 1; i >= 0; i--) {
            if (ret.isEmpty()) {
                ret = ret + list.get(i);
            } else ret = ret + " " + list.get(i);
        }
        return ret;
    }
}