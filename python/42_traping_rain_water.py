class Solution(object):
    def trap(self, height):
        if len(height) == 0:
            return 0

        l = 0
        r = len(height)-1
        lMax = height[l]
        rMax = height[r]
        res = 0

        while l<r:
            if lMax < rMax:
                l = l+1
                lMax = max(lMax, height[l])
                res = res + (lMax - height[l])
            else:
                r = r-1
                rMax = max(rMax, height[r])
                res = res + (rMax, height[r])
            
        return res
    