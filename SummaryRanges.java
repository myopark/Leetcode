/***
https://leetcode.com/problems/summary-ranges/
*/
public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> results = new ArrayList<String>();
        if(nums.length == 0 || nums == null){
            return results;
        }
        if(nums.length==1){
		    results.add(nums[0]+"");
		    return results;
	    }

        for(int i = 0; i < nums.length; ++i){
            int low = nums[i];
            while(i+1<nums.length&&(nums[i+1]-nums[i])==1){
    		    i++;
    	    }
            if(low == nums[i]){
                results.add(low + "");
            }
            else{
                results.add(low + "->" + nums[i]);
            }
        }
        return results;
    }
}

/*
1. sorted int array, no dups
output: summary of ranges which is a range that has no skips, if it skips over a number that'll be the start of a new range, if the difference between high and low is greater than it's iterati

Brute Force:
O(n)
keep track of low,
uppr is

[0,1,2,4,5,7], return ["0->2","4->5","7"].
[..... 6,7, 8]
low =  0
i = 0
i+1 = 1
difference = 1

*/
