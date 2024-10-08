class Solution {
    public int findMin(int[] nums) {
        
        if(nums.length == 0){
            return -1;
        }
        if(nums.length ==1){
            return nums[0];
        }
        int pivot = findPivot(nums);
        if(pivot == -1){
            return nums[0];
        }
        else{
            return nums[pivot +1];
        }
    }
    int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}