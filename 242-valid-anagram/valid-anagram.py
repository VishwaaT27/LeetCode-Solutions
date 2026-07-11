class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        sl = list(s)
        tl = list(t)
        if(len(sl) == len(tl)):
            for i in sl:
                if i not in tl:
                    return False
                else:
                    tl.remove(i)
            return True
        else:
            return False