package day3;

public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {};
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }
    public static double  findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num = new int[nums1.length+nums2.length];
        if(num.length == 0) {
            return 0;
        }
        int i = 0;
        int j = 0;
        int k = 0;
        while(k < num.length) {
            if(i == nums1.length) {
                num[k++] = nums2[j++];

            } else if (j == nums2.length) {
                num[k++] = nums1[i++];
            } else if (nums1[i] < nums2[j]) {
                num[k++] = nums1[i++];
            }else {
                num[k++] = nums2[j++];
            }
        }
        if(num.length%2==0){
            return ((double)num[num.length/2]+(double)num[num.length/2-1])/2;
        }else {
            return (double) num[num.length/2];
        }
    }
}
