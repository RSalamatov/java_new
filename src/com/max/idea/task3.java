package com.max.idea;

public class task3 {
      public static void main(String[] args) {
            int[] nums = {250, 2, 3, 4, 300};

            int last = nums[nums.length-1];
            int first = nums[nums.length-5];
            nums[0] = last;
            nums[4] = first;
            int sum = nums[nums.length-5] + nums[nums.length-3];
            System.out.println(sum);
      }
}