class Solution {
        /*Bucket Sorting --> O(N) */
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        // step 1 : count freq of each element
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        //step 2 : Build Buckets for the values
        List<Integer> []freqBuckets = new ArrayList[n+1]; // why n+1 ? at most element can appear n times 
        // fill the each index with empty list
        for(int i = 0; i < n+1; i++){
            freqBuckets[i] = new ArrayList<>();
        }

        // step 3 : Iterate on map to fill buckets as per their values
        for(Map.Entry<Integer,Integer> set : freq.entrySet()){
            int count = set.getValue();
            int number = set.getKey(); 
            freqBuckets[count].add(number);
        }

        //step 4 :  get the top k elements by iterating the buckets from back 
        int ans[] = new int[k];
        int index = 0;
        for(int i = freqBuckets.length-1; i > 0 && index < k; i--){ // why i > 0 ? because 0 index means count is 0. so no need to check.
            for(int number : freqBuckets[i]){
                ans[index++] = number;
                if(index == k)
                    return ans;
            }
        }
        return ans;
    }
    /* Min Heap + Freq counting Approach */
    public int[] topKFrequent2(int[] nums, int k) {
        int n = nums.length;
        int []ans = new int[k];

        Map<Integer,Integer> freq = new HashMap<>(); // o(N)
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num,0)+1); // counting freq of each element.
        }
        
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[1] - b[1]); // O(N*logK)
        for(Map.Entry<Integer,Integer> set : freq.entrySet()){
            minHeap.offer(new int[]{set.getKey(), set.getValue()});
            if(minHeap.size() > k){
                minHeap.poll(); // remove the element which is less frequent
            }
        }

        // build answer with top k freq elements O(K*LogK)
        for(int i = 0; i<k; i++){     // here the size of minHeap definitely == k. so no need to check isEmpty.
            ans[i] = minHeap.poll()[0]; // after poll() , heapify takes LogK.
        }
        return ans;
    }



    /* Freq Counting + Sorting based on Freq of element */
    public int[] topKFrequent3(int[] nums, int k) { // O(N*LogN)
        int n = nums.length;

        // step 1 count the freq of each element
        HashMap<Integer, Integer> freq = new HashMap<>(); // Space O(N)
        for(int num : nums){ // O(N)
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        // step 2 sort based on frequencies
        List<int[]> list = new ArrayList<>(); // Space O(N)
        for(Map.Entry<Integer,Integer> pair : freq.entrySet()){ // O(N)
            list.add(new int[]{pair.getKey(), pair.getValue()});
        }
        list.sort((a,b) -> b[1] - a[1]); // NLogN
        
      /*list.sort(new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    return b[1] - a[1]; // Same logic as the lambda
                }
        }); */

        // add k most elements into ans array
        int ans[] = new int[k];
        for(int i = 0; i < k; i++){ // O(K)
            ans[i] = list.get(i)[0];
        }
        return ans;
    }
}