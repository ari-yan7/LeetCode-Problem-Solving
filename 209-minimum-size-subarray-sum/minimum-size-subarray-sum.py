class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        left = 0
        currentsum = 0
        minlen = float('inf')
        for right in range(len(nums)) :
            currentsum += nums[right]

            while currentsum >= target :
                minlen = min(minlen, right-left+1)
                currentsum -= nums[left]
                left += 1
        return 0 if minlen == float('inf') else minlen