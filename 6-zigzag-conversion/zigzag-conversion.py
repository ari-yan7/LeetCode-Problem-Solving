class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1: return s
        rows = [[]for _ in range (numRows)]
        current = 0
        direction = 1
        for char in s :
            rows[current].append(char)
            current += direction
            if current == numRows-1 or current == 0:
                direction = -direction
        return "".join("".join(row) for row in rows)