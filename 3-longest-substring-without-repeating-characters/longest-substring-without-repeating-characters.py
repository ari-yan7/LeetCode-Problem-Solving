class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        maxlen = float('-inf')
        currentstring = ""
        for i in range(len(s)) :
            ch = s[i]
            if ch in currentstring :
                maxlen = max(maxlen,len(currentstring))
                idx = currentstring.index(ch)
                currentstring = currentstring[idx+1:]
                currentstring += ch
            else :
                currentstring += ch
        maxlen = max(maxlen, len(currentstring))
        return 0 if maxlen == float('-inf') else maxlen