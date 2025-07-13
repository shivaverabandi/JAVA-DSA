class Solution {
    public int[] topKFrequent(int[] nums, int k) {
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
    public int[] topKFrequent2(int[] nums, int k) { // O(N*LogN)
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