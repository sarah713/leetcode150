public class RemoveDupe {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int idx = 2;
        for (int j = 2; j < nums.length - 2; j++) {
            if (nums[idx] != nums[j]) {
                nums[idx] = nums[j];
                idx++;
            }
        }
        return idx;
    }
}
