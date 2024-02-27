class Solution {
    public boolean search(int[] nums, int target) {
        // Arrays.sort(nums);

        // for(int i=0; i<nums.length; i++){
        // if(nums[i]==target){
        // return true;
        // }
        // }

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;
            System.out.println(nums[mid]);
            if (nums[mid] == target) {
                return true;
            }
            // We know that right side is for sure sorted or left side is unsorted
            if (nums[mid] < nums[high] || nums[mid] < nums[low]) {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            // We know that left side is for sure sorted or right side is unsorted
            else if (nums[mid] > nums[low] || nums[mid] > nums[high]) {
                if (nums[mid] > target && target >= nums[low]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            } else {
                low++;
            }
        }

        return false;
    }
}