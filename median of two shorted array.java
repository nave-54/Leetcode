/*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5. */

// Solution

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len=nums1.length;
        int len2=nums2.length;
        int len3=len+len2;
        int a=0,q=0,s=0;
        int[] ans=new int[len3];
        while(nums1.length>a)
        {
              ans[q++]=nums1[a++];
        }
        while(nums2.length>s)
        {
              ans[q++]=nums2[s++];
        }
        double res=0;
        Arrays.sort(ans);
        if(len3%2==0){
        res=(ans[(len3/2)]+ans[(len3/2)-1])/2.0;
        }
        else {
            res=ans[len3/2];
        }
        return res;
    }
}