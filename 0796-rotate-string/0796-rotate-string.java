class Solution {
    public boolean rotateString(String s, String goal) {
        // If lengths differ, cannot be rotations
        if (s.length() != goal.length()) {
            return false;
        }
        // A rotation of s must appear in s + s
        String doubled = s + s;
        return doubled.contains(goal);
    }
}