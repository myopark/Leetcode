/*
https://leetcode.com/problems/plus-one/
*/
public class Solution {
    public int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0){
            return digits;
        }
        
        int i = digits.length - 1;
        
        while(i >= 0){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
            --i;
        }
        int[] results = new int[digits.length + 1];
        results[0]++;
        return results;
    }
}
/* 

 [ 1 , 2, 3]
 [1, 2, 4]
 
 
 
 [1, 2,  9]
 []
 9 / 10 == 0
 10 % 9 == 1 
 [1, 3, 0]
 
 [1, 9, 9, 9]
 1, 10, 10 , 10
 [2, 0, 0, 0]
 
 [9, 9 ,9 ,9]
 [1, 0, 0 , 0, 0]

*/
