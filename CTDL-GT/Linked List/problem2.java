class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m + n];
        int nums1Pointer = 0;
        int nums2Pointer = 0;
        int idx = 0;
        // add sorted num from nums1 or num2 by comparing value at nums1Pointer and num2Pointer
        while (nums1Pointer < m && nums2Pointer < n && idx < merged.length) {
            if (nums1[nums1Pointer] <= nums2[nums2Pointer]) {
                merged[idx] = nums1[nums1Pointer];
                nums1Pointer++;
            } else {
                merged[idx] = nums2[nums2Pointer];
                nums2Pointer++;                
            }
            idx++;
        }
        // add remaining sorted num from nums1 if any
        while (nums1Pointer < m && idx < merged.length) {
            merged[idx] = nums1[nums1Pointer];
            nums1Pointer++;
            idx++;
        }
        // add remaining sorted num from nums2 if any
        while (nums2Pointer < n && idx < merged.length) {
            merged[idx] = nums2[nums2Pointer];
            nums2Pointer++;
            idx++;
        }
        //nums1 = new int[n + m](merged);
        for (int i = 0; i < merged.length; i++) {
            nums1[i] = merged[i];
        }
    }
}