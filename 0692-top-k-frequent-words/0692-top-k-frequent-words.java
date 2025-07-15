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
            if(freq.get(a) == freq.get(b)){
                return b.compareTo(a);
            }else{
                return freq.get(a) - freq.get(b);
            }
        });

        for(String s : freq.keySet()){
            minHeap.offer(s);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        List<String> ans = new LinkedList<>();
        while(!minHeap.isEmpty()){
            ans.addFirst(minHeap.poll());
        }
        return ans;
    }
}