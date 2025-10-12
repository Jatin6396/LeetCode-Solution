class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        for (int i = 0; i < nums1.length; i++) {
            int flag = 0;
            for (int k = 0; k < nums2.length; k++) {
                if (nums1[i] == nums2[k]) {
                    for (int j = k + 1; j < nums2.length; j++) {
                        if (nums1[i] < nums2[j]) {
                            nums1[i] = nums2[j];
                            flag = 1;
                            break;
                        }
                    }
                    break;
                }
            }
            if (flag == 0) {
                nums1[i] = -1;
            }

        }
        return nums1;
    }
}