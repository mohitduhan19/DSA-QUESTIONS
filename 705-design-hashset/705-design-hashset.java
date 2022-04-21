class MyHashSet {
    private int numbuckets = 15000;
    List<Integer>[] buckets;
    private int hashfunction(int key){
        return key%numbuckets;
    } 
    public MyHashSet() {
        buckets = new LinkedList[numbuckets];
        
    }
    
    public void add(int key) {
        int i = hashfunction(key);
        if(buckets[i] == null)buckets[i] = new LinkedList<>();
        if(buckets[i].indexOf(key) == -1)buckets[i].add(key);
    }
    
    public void remove(int key) {
         int i = hashfunction(key);
        if(buckets[i] == null)buckets[i] = new LinkedList<>();
        if(buckets[i].indexOf(key) != -1)buckets[i].remove(buckets[i].indexOf(key));
    }
    
    public boolean contains(int key) {
        int i = hashfunction(key);
        if(buckets[i] == null || buckets[i].indexOf(key) == -1 )return false;
        return true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */