package easy;

/**
 * @author eruyuwe
 * @date 2019/04/12
 * 
 *       Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * 
 *       Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1)
 *       extra memory.
 * 
 *       The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * 
 *       Example 1:
 * 
 *       Given nums = [3,2,2,3], val = 3,
 * 
 *       Your function should return length = 2, with the first two elements of nums being 2.
 * 
 *       It doesn't matter what you leave beyond the returned length. Example 2:
 * 
 *       Given nums = [0,1,2,2,3,0,4,2], val = 2,
 * 
 *       Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
 * 
 *       Note that the order of those five elements can be arbitrary.
 * 
 *       It doesn't matter what values are set beyond the returned length.
 */
public class RemoveElement {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] nums1 = new int[] {3, 2, 2, 3};
        int[] nums2 = new int[] {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println("output of  {3,2,2,3} is " + removeElement(nums1, 3));
        System.out.println("output of  {3,2,2,3} is " + removeElement(nums2, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
