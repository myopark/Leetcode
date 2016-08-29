/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> results = new ArrayList<Interval>();
        if(intervals == null || intervals.size() <= 0){
            return results;
        }
        //sort
        
        Collections.sort(intervals, new Comparator<Interval>(){
         @Override
            public int compare(Interval i1, Interval i2) {
                return Integer.compare(i1.start, i2.start);
            }
        });
        
        
        int min = intervals.get(0).start;
        int max = intervals.get(0).end;
        for(int i = 0; i < intervals.size(); ++i){
           if(intervals.get(i).start <= max){
               //if start is less than max, the current interval has to check wither it is in bounds 
               max = Math.max(max, intervals.get(i).end);
               //and get the new max if needed
           }
           else{
               //max < start, no overlap
               results.add(new Interval(min,max));
               min = intervals.get(i).start;
               max = intervals.get(i).end;
           }
            
        }
        results.add(new Interval(min,max));
        return results;
    }
}
/*

1. Array of intervals
--> merge the intervals

when do you want to merge?
when the number is between the min and max, min and max are the same
//when the start is between min and max merge
when the end is bigger than the max, then put min and max into list
min is now the next start and max is the next end
[1,2][3,4][5,6]

[1,5][3,4]
[1,5]
*/
