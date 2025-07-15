class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        int n = words.length;

        // step 1 : count freq of each word
        Map<String,Integer> freq = new HashMap<>();
        for(String s : words){
            freq.put(s, freq.getOrDefault(s,0)+1);
        }

        // step 2 : build min_heap based on freq, if freq is equal then lexical order

        PriorityQueue<String> minHeap = new PriorityQueue<>( (a,b) -> {
            if(freq.get(a) == freq.get(b)){ // sort based on lexical order if count is equal
                return b.compareTo(a); // here compare b with a ? because at final we have to add them in lexical order. so here we sort them in reverse order for the words which have same freq count.
            }else{
                return freq.get(a) - freq.get(b); // sort based on count of word
            }
        });
        // O(N*LogK)
        for(String s : freq.keySet()){ // O(N)
            minHeap.offer(s);
            if(minHeap.size() > k){ 
                minHeap.poll(); // O(LogK) 
            }
        }

        List<String> ans = new LinkedList<>(); // K*LogK
        while(!minHeap.isEmpty()){
            ans.addFirst(minHeap.poll()); // to add at first we use linked list. It takes O(1) time to add at first of list
        }
        return ans;
    }
}