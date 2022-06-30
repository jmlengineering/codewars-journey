package com.removeduplicates;/*
*
* Date : 06.22.22
* My Thought Process:
* 1. Go through a given array and ignore duplicates
* 2. Place unique values in front of array
* 3. Use the  hash set data structure
*
*/

public class RemoveDuplicatesFromSortedArray {
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0)
                return 0;

            int i = 0;

            for (int j = 1; j < nums.length; j++) {
                if (nums[j] != nums[i]) { // Finding unique values
                    i++;
                    nums[i] = nums[j];
                }
            }
            return i + 1;
        }
}

