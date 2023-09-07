public class MajorityElementI {
    public int majorityElement(int[] nums) {
        int cnt = 0, ele = 0;
        int n = nums.length;
        for (int i : nums) {
            if (cnt == 0) {
                ele = i;
                cnt = 1;
            } else if (ele == i) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return ele;
    }
}
