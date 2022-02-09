class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i = 0;
        int j = 0;
        HashSet<Integer> intersection = new HashSet<>();
        while(i <nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                intersection.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        
        int[] res = new int[intersection.size()];
        int k = 0;
        for(int num : intersection){
            res[k] = num;
            k++;
        }
        return res;
    }
}