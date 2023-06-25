// 242. Valid Anagram
class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        char[] arrs = s.toCharArray();
        char[] arrt = t.toCharArray();
        
        Arrays.sort(arrs);
        Arrays.sort(arrt);

        String sorteds=new String(arrs);
        String sortedt=new String(arrt);

        if(sorteds.equals(sortedt))
            return true;

        return false;

    }
}