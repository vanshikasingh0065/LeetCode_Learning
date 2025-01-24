class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """

        map = {}
        for i in s:
            if i not in map:
                map[i] =1
            else:
                map[i] = map[i]+1
    
        for j in t:
            if j not in map:
                return False
            else:
                map[j] = map[j]-1
    
    #if the map still contains any key with value not qual to zero, we return False
        for val in map.values():
            if val!=0:
                return False
    

        return True
        