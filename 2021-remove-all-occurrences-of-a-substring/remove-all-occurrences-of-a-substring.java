class Solution {
    public String removeOccurrences(String s, String part) {
        int idx = s.indexOf(part);
        while (idx != -1) {
            // remove the substring part
            s = s.substring(0, idx) + s.substring(idx + part.length());
            idx = s.indexOf(part);  // check for next occurrence
        }
        return s;
    }
}
