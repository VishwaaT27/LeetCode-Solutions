import java.util.Stack;
class Solution 
{
    public int longestValidParentheses(String s) 
    {
        Stack<Integer> st = new Stack<>();
        int[] valid = new int[s.length()];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) 
            if (chars[i] == '(') st.push(i);
            else if (chars[i] == ')' && !st.isEmpty()) 
            {
                int idx = st.pop();
                valid[idx] = 1; valid[i] = 1;
            }
        int maxLen = 0, currLen = 0;
        for (int v : valid) 
            if (v == 1) 
            {
                currLen++;
                maxLen = Math.max(maxLen, currLen);
            } 
            else currLen = 0;
        return maxLen;
    }
}