//remove duplicates from array
/*public class Solution {
        public int removeDuplicates(int[] nums) {
            int k=1;
            if(nums.length==0){
                System.out.println("no number entered");
                return k=0;
            }
            for(int i = 1; i<nums.length;i++){
                if(nums[i]!=nums[i-1]){
                    nums[k]=nums[i];
                    k++;
                }
            }
            return k;
        }
        public static void main(String[]args){
            Solution sol = new Solution();
            int[] nums = {1,1,2,3,7,7,5};
            int k = sol.removeDuplicates(nums);
            System.out.println("the number is "+k);
            for(int i = 0; i<k;i++){
                System.out.println(nums[i]);
            }
        }
    }*/

//summing up array to find the target
/*public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {};
    }

        public static void main (String[]args){
            Solution sol = new Solution();
            int[] nums = {1, 2, 8, 5, 6};
            int target = 8;
            int[] result = sol.twoSum(nums, target);
            System.out.println("the indices are " + result[0] + " " + result[1]);
        }
    }*/
public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;  // Pointer to track the position of valid elements

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val
            if (nums[i] != val) {
                // Move the valid element to the "next" available position
                nums[k] = nums[i];
                k++;  // Increment the counter for valid elements
            }
        }

        // k is the number of elements not equal to val
        return k;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3, 2, 2, 3, 4, 3, 5};
        int val = 3;

        // Call the removeElement function
        int k = sol.removeElement(nums, val);

        // Output the result
        System.out.println("Number of elements not equal to " + val + ": " + k);

        // Print the modified array (first k elements are valid)
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}




