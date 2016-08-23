/*
https://leetcode.com/problems/missing-ranges/
*/
public class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> results = new ArrayList<String>();
        //keep a trailer that iterates
        for(int i = 0; i < nums.length; ++i){
         int below = nums[i] - 1;
         //if justbelow is the lower bound, then theres only a single
         if(below == lower){
             results.add(lower+"");
         }
         //now what if lower is less thaan just below? then you know that there is a range
         else if(lower < below){
             results.add(lower + "->" + below);
             
         }
         lower = nums[i] + 1;
        }
        if(lower == upper){
             results.add(lower+"");
         }
         //now what if lower is less thaan just below? then you know that there is a range
         else if(lower < upper){
             results.add(lower + "->" + upper);
             
         }
         return results;
        
    }
}

/*
1.
-Sorted INT array
-lower bound and upper bound Ints(inclusive)
-return list

2.
Brute Force: 
Go through
0 1 2 3 4 

0 1 3 50 75
2, 4->49, 51->74, 76->99

Note: Now I didn't quite get this without looking at the solution, but to my understanding, you are taking your current number and getting just below that number, while keeping track of the lower bound, which should be the minimum number in that window + 1. if that lower bound is equivalent to one below ur current number ie 5->5, then you u have a single number to add. 

*/
