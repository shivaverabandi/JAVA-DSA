class MyHashSet {

    boolean set[];

    public MyHashSet() {
        set = new boolean[1000001];
    }
    
    public void add(int key) {
        set[key] = true;
    }
    
    public void remove(int key) {
        set[key] = false;
    }
    
    public boolean contains(int key) {
        return set[key];
    }


/*    private ArrayList<Integer> hashBucket;

    public MyHashSet() {
        hashBucket = new ArrayList<>();
    }
    
    public void add(int key) {
        for(int num : hashBucket){ // o(N)
            if(num == key){
                return;
            }
        }

        hashBucket.add(key);
    }
    
    public void remove(int key) {
        for(int i = 0; i < hashBucket.size(); i++){ // o(N)
            if(key == hashBucket.get(i)){
                hashBucket.remove(i);
            }
        }
        
    }
    
    public boolean contains(int key) { // o(N)
        for(int num : hashBucket){
            if(num == key){
                return true;
            }
        }
        return false;
    }

*/

}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */