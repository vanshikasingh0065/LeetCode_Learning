class Solution:
    def reverseWords(self, s: str) -> str:
        spt = s.split()
        ans = []
        for k in spt[::-1]:
            ans.append(k)
        print(ans)
        l = ' '.join(ans)
        return l


        