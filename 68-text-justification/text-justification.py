class Solution:
    def fullJustify(self, words: List[str], maxWidth: int) -> List[str]:
        result = []
        length = 0
        current_line = []
        i = 0
        while i < len(words) :
            if len(current_line) + length + len(words[i]) > maxWidth :
                extraspace = maxWidth - length
                spaces = extraspace // max(1,len(current_line)-1)
                reminder = extraspace % max(1,len(current_line)-1)
                for j in range (max(1,len(current_line)-1)) :
                    current_line[j] += " " * spaces
                    if reminder :
                        current_line[j] += " "
                        reminder -= 1
                result.append("".join(current_line))
                length = 0
                current_line = []
            current_line.append(words[i])
            length += len(words[i])
            i += 1
        lastline = " ".join(current_line)
        remainingspace = maxWidth - len(lastline)
        result.append(lastline + " " * remainingspace)
        return result