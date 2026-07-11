class Solution(object):
    def reverseString(self, s):
        """
        :type s: List[str]
        :rtype: None Do not return anything, modify s in-place instead.
        """
        # k = s[::-1]
        # for i in range(len(k)):
        #     s[i] = k[i]
        
        l = 0
        r = len(s) - 1
        while (l<r):
            z = s[l]
            s[l] = s[r]
            s[r] = z
            l += 1
            r -= 1