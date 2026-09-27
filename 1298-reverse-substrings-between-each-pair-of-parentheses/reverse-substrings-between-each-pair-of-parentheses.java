class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder(s);

        while (sb.indexOf("(") != -1) {
            int lastOpen = sb.lastIndexOf("(");
            int matchingClose = sb.indexOf(")", lastOpen);

            String inner = sb.substring(lastOpen + 1, matchingClose);
            String reversed = new StringBuilder(inner).reverse().toString();

            sb.replace(lastOpen, matchingClose + 1, reversed);
        }

        return sb.toString();
    }
}