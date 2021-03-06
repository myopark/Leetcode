/*
https://leetcode.com/problems/lru-cache/
LinkedHashMap: https://docs.oracle.com/javase/7/docs/api/java/util/LinkedHashMap.html
*/
ublic class LRUCache {

    
    int capacity;
    LinkedHashMap<Integer,Integer> cache =  new LinkedHashMap<Integer,Integer>();
    public LRUCache(int capacity) {
        this.capacity = capacity;
        
    }
    
    public int get(int key) {
       if(cache.containsKey(key)){
           int value = cache.get(key);
           cache.remove(key);
           cache.put(key, value);
           return value;
       }
     return -1;
    }
    
    public void set(int key, int value) {
        if(cache.containsKey(key)){
            cache.remove(key);
        }
        else if(this.capacity == cache.size()){
           //remove first
           Iterator<Integer> i = cache.keySet().iterator();
           int last = i.next(); 
           cache.remove(last);
           
        }
         cache.put(key, value);
    }
  
}
