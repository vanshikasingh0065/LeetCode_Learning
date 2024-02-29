class Solution {
public:
    int characterReplacement(string s, int k) {
        
        /* ABABAB k = 2 */
        /*A B A B A B */
        
        int left = 0, right = 0;
        unordered_map<char, int> mmap;
        int maxfreq = 0;
        int res = 0;
        for(int right= 0; right < s.size(); right++) {
            
            mmap[s[right]]++;
            maxfreq = max(maxfreq, mmap[s[right]]);
            
            if(right - left +1 - maxfreq > k) {
                
                mmap[s[left]]--;
                if(mmap[s[left]] == 0) {
                    mmap.erase(s[left]);
                }
                left++;
                maxfreq = 0;
                for(int i = 0; i < 26 ; i++) {
                    maxfreq = max(maxfreq , mmap['A'+i]);
                }
                
            }
            
            res = max( res, right -left +1 );
            
        }
        
        return res;
        
    }
};