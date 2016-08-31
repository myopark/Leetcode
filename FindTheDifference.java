public class Solution {
    public char findTheDifference(String s, String t) {
        
      HashMap<Character,Integer> map = new HashMap<Character,Integer>();
      for(int i = 0; i < s.length(); ++i){
          if(!map.containsKey(s.charAt(i))){
              map.put(s.charAt(i), 1);
          }
          else{
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
          }
      }
      char c = ' ';
      for(int j = 0; j < t.length(); ++j){
          if(map.containsKey(t.charAt(j))){
              map.put(t.charAt(j), map.get(t.charAt(j)) - 1);
          }
          else{
             map.put(t.charAt(j), 1);
          }
      }
      for(Character key: map.keySet()){
          if(map.get(key) != 0){
              c = key;
          }
      }
    return c;
    }
}


/*
1. s = string
    t = string with an inserted letter
    
    t.length == s.length + 1
    
    Goal Output: ONE letter difference DUPES
    
    Brute Force/Naive Solution: 
     Worst implementation: go through each letter, to find if it exist in s, it doesn't return it O(N N)(?))
     
     -Here's another idear. Hashtable S and go through T contains(char) else return it
     lookupp technically o(1), O(m) + O(n) O(m) space
    - Look through in one iteration? 
    Hashmap -> character count and subtract/add 
    Can use an array instead 


*/
