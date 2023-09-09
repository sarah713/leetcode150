public class ProductExceptItself {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProd = new int[nums.length];
        int[] rightProd = new int[nums.length];

        int prod = 1;
        leftProd[0] = prod;
        for (int i = 1; i < nums.length; i++) {
            prod = prod * nums[i - 1];
            leftProd[i] = prod;
        }

        prod = 1;
        rightProd[nums.length - 1] = prod;
        for (int i = nums.length - 2; i >= 0; i--) {
            prod = prod * nums[i + 1];
            rightProd[i] = prod;
        }

        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = leftProd[i] * rightProd[i];
        }
        return output;
    }
}
