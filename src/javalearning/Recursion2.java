package javalearning;

import java.util.Arrays;

public class Recursion2 {
	final static Recursion2 INSTANCE = new Recursion2();
	
	private Recursion2() {
	}
	
	public boolean groupSum(int start, int[] nums, int target){
		
		// Base case: if there are no numbers left, then there is a
		// solution only if target is 0.
		
		if(start>=nums.length){
			System.out.printf("start: %d >= nums.length(%d)%n", start, nums.length);
			return (target == 0);
		}
		
		// Key idea: nums[start] is chosen or it is not.
		// Deal with nums[start], letting recursion
		// deal with all the rest of the array.
		
		// Recursive call trying the case that nums[start] is chosen --
		// subtract it from target in the call.
		if(groupSum(start + 1, nums, target - nums[start])){
			System.out.printf("start + 1: %d , nums: %s, target - nums[start](%d)%n", 
					start + 1, Arrays.toString(nums), target - nums[start]);
			return true;
		}
		
		if(groupSum(start + 1, nums, target)){
			System.out.printf("start + 1: %d , nums: %s, target(%d)%n", 
					start + 1, Arrays.toString(nums), target);
			return true;
		}
		
		// If neither of the above worked, it's not possible.
		System.out.println("false");
		return false;
		
		
	}
}
