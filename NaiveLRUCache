public class LRUCache {
    
    int capacity;
    HashMap<Integer, Node> cache;
    Node head;
    Node last;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<Integer, Node>();
        head = new Node(0, 0);
	    last = new Node(0, 0);
	    head.next = last;
	    last.prev = head;
	    head.prev = null;
	    last.next = null;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node n = cache.get(key);
            remove(n);
            addLast(n);
            return n.value;
        }
        return -1;
    }
    
    public void set(int key, int value) {
        if(cache.containsKey(key)){
            Node val = new Node(key, value);
            Node n = cache.get(key);
            cache.put(key, val);
            remove(n);
            addLast(val);
        }
        else{
            Node val = new Node(key, value);
            if(this.capacity == cache.size()){
                cache.remove(last.prev.key);
                remove(last.prev);
            }
             addLast(val);
             cache.put(key, val);
            
        }
    }
    
    public void addLast(Node node){
    	node.next = head.next;
	    node.next.prev = node;
    	node.prev = head;
    	head.next = node;
    }
    
    public void remove(Node n){
        n.prev.next = n.next;
        n.next.prev = n.prev;
    }
    class Node{
        int key;
        int value;
        Node prev;
        Node next;
        public Node(int key, int value ){
            this.key = key;
            this.value = value;
        }
    }
}
