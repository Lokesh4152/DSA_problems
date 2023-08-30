// Problem Description
// Given an unsorted array of integers, find the smallest missing positive integer. The space complexity need not be O(1), you can also implement a O(N) space complexity solution.

// Input format
// There are 2 lines of input.

// First line contains 1 integer N - Number of elements in the array.

// Second line contains space separated N integers.

// Output format
// Print the smallest missing positive integer.

// Sample Input 1
// 4

// 3 4 -1 1

// Sample Output 1
// 2

// Explanation 1
// 2 is the smallest positive integer which is missing as 1 is already present in the array. Note that 0 will not be considered as positive.

// Constraints
// N <= 200000

// -2 ^ 31 <= Range of values <= 2 ^ 31 - 1

import java.util.*;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        // 1.Create a maxNum variable possible for the question
        // 2. Crete a Boolean array of that length.
        // 3. if array element is less than the maxNum variable and is greater than 0. since we are considering only the max positive number.
        // 4. mark the elements present in the boolean array.
        // 5. check which element is not present and return it.
        // 6. if all elements are present means we need to return the max element of the array +1;
        
        int n = nums.length;
        int maxNum = 200001;
        boolean present [] = new boolean [maxNum];
        int maxEle = Integer.MIN_VALUE;

        for(int i=0; i < n; i++){
            if(nums[i] > 0 && nums[i] <= maxNum){
                present[nums[i]] = true;
            }
            maxEle = Math.max(maxEle, nums[i]);
        }
        for(int i=1; i<maxNum; i++){
            if(!present[i]){
                return i;
            }
        }
        return maxEle + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; ++i) {
            nums[i] = in.nextInt();
        }
        int result = new FirstMissingPositive().firstMissingPositive(nums);
        System.out.println(result);
    }
}


