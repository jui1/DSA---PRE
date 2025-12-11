public class Rearrange {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4}; 

        int[] result = rearrangeArray(nums);

        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] rearrangeArray(int[] nums) {
        int p = 0; 
        int n = 1; 
        int[] arr = new int[nums.length];

        for (int num : nums) {
            if (num > 0) {
                arr[p] = num;
                p += 2; 
            } else {
                arr[n] = num;
                n += 2; 
            }
        }

        return arr;
    }
}
