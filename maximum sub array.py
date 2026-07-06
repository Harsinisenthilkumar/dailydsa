class Solution:
    def maxSubarraySum(self, arr):
        current_sum= arr[0]
        max_sum= arr[0]
        for num in arr[1:]:
            current_sum=max(num,current_sum+num)
            max_sum=max(max_sum,current_sum)
        return max_sum