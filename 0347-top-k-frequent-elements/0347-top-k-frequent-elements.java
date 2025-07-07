class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        // step 1 count the freq of each element
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        // step 2 sort based on frequencies
        List<int[]> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> pair : freq.entrySet()){
            list.add(new int[]{pair.getKey(), pair.getValue()});
        }
        list.sort((a,b) -> b[1] - a[1]);

        // add k most elements into ans array
        int ans[] = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = list.get(i)[0];
        }
        return ans;
    }
}