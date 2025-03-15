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
//removing values mentioned in variable val
/*public class Solution {
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
}*/
//JAVA quiz game
import java.sql.SQLOutput;
/*import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
String[] questions = {"total number of alphabets", "what is the last number in number system", "which colour does a blue ink pen gives when writing", "what is the language used in front-end development"};
String[][] answers  = {{"1. 23","2. 26","3. 32","4. 46"}, {"1. infinity", "2. 10", "3. 12", "4. 13"},{"1. red", "2. green", "3. blue", "4. yellow"},{"1. css", "2. english", "3. malayalam", "4. hindi"}};
int[] correct = {2,1,3,1};
int k = 0;
Scanner sc = new Scanner(System.in);
for(int i = 0; i< questions.length; i++){
    System.out.println(questions[i]);
    for(int j = 0; j< answers.length;j++) {
        System.out.println(answers[i][j]);

    }
    System.out.print("enter your guess ");
        int guess = sc.nextInt();
        if(guess == correct[i]){
            System.out.println("correct!!");
            k++;
        }
        else{
            System.out.println("wrong");
        }



}
        System.out.println("score is "+k);
}
}*/
//rock paper scissor game
import java.util.Random;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String playAgain;


        do{
            System.out.println("lets play rock paper and scissor with computer");
            String[] answer = {"rock", "paper", "scissor"};
            String options;
            String rand;
            System.out.print("enter your move ");
            options = sc.nextLine();

            if (!options.equals("rock") && !options.equals("paper") && !options.equals("scissor")) {
                System.out.println("invalid");
            } else {
                System.out.println("the computer's move is ");
                rand = answer[random.nextInt(3)];
                System.out.println(rand);
                if (options.equals(rand)) {
                    System.out.println("its a tie");
                } else if (options.equals("scissor") && rand.equals("paper") ||
                        options.equals("rock") && rand.equals("scissor") ||
                        options.equals("paper") && rand.equals("rock")) {
                    System.out.println("you win");
                } else {
                    System.out.println("you lose");
                }
            }
            System.out.println("do you wanna play again?");
            playAgain = sc.nextLine();
        }

        while (playAgain.equals("yes"));

            System.out.println("thanks for playing");


    }
}





