class Solution {
    public boolean halvesAreAlike(String s) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        int n = s.length();
        int mid = n / 2;
        
        for (int i = 0; i < mid; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) count++;
        }
        for (int i = mid; i < n; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) count--;
        }
        
        return count == 0;
    }
}   