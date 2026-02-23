class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        // Try every possible substring length from 1 to n/2
        for (int len = 1; len <= n / 2; len++) {
            if (n % len == 0) { // pattern length must divide full length
                String sub = s.substring(0, len);
                StringBuilder sb = new StringBuilder();
                
                // Build the string by repeating sub
                int times = n / len;
                for (int i = 0; i < times; i++) {
                    sb.append(sub);
                }
                
                // If matches original string, we found the pattern
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        
        return false;
    }
}