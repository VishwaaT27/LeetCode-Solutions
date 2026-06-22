class Solution
{
    public String minWindow(String s, String t)
    {
        if(s.length() < t.length())
            return "";

        int[] freq = new int[128];

        for(char c : t.toCharArray())
            freq[c]++;

        int left = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int need = t.length();

        for(int right = 0; right < s.length(); right++)
        {
            char c = s.charAt(right);

            if(freq[c] > 0)
                need--;

            freq[c]--;

            while(need == 0)
            {
                if(right - left + 1 < minLen)
                {
                    minLen = right - left + 1;
                    start = left;
                }

                char lc = s.charAt(left);

                freq[lc]++;

                if(freq[lc] > 0)
                    need++;

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}