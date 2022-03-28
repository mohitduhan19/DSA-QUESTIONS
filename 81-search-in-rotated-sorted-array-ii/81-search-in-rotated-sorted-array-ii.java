class Solution {
    public boolean search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target)return true;
            if(arr[left] < arr[mid]){
                if(target >= arr[left] && target < arr[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
           else if(arr[left] > arr[mid]){
                if(target > arr[mid] && target <= arr[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }else
            left++;
        }
        return false;
    }
}