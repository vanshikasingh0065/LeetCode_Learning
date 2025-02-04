class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs:
            return ""

        for i in range(len(strs[0])):
            c = strs[0][i]
            for s in strs:
                if i == len(s) or s[i] != c:
                    return strs[0][:i]

        return strs[0]