class Solution {
    public int reverseDegree(String s) {
        int totalSum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int reversedAlphabetPos = 26 - (c - 'a');
            int stringPos = i + 1;
            totalSum += reversedAlphabetPos * stringPos;
        }
        return totalSum;
    }
}