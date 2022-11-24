import java.util.Arrays;

/**
 * LEETCODE - 4 - Median of Two Sorted Arrays
 * <p>
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 * <p>
 * Example 01
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * <p>
 * Example 02
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 **/

public class LeetCode_4_MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median;

        int m = nums1.length;
        int n = nums2.length;
        int[] mergedArray = new int[m+n];

        System.arraycopy(nums1, 0, mergedArray, 0, m);
        System.arraycopy(nums2, 0, mergedArray, m, n);

        Arrays.sort(mergedArray);

        if (mergedArray.length % 2 == 0){
            median = ((double)mergedArray[mergedArray.length/2] + (double)mergedArray[mergedArray.length/2 - 1])/2;
        } else {
            median = (double) mergedArray[mergedArray.length/2];
        }

        return median;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
