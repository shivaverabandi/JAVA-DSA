class Solution {
    public List<String> commonChars(String[] words) {
        int cmnCharCnt[] = new int[26];
        int currCharCnt[] = new int[26];
        List<String> ans = new ArrayList<>();

        // step 1 --> count freq of chars in words[0].
        for(int i = 0; i < words[0].length(); i++){
            char ch = words[0].charAt(i);
            cmnCharCnt[ch - 'a']++;
        }
        // step 2 --> travese whole array from 1 to length
        for(int i = 1; i < words.length; i++){ // Time Complexity --> O(n * k)
            Arrays.fill(currCharCnt,0);
            // step 2.1 --> count freq of chars in words[i].
            for(char letter : words[i].toCharArray()){ // --> O(K)
                currCharCnt[letter - 'a']++;
            }
            // step 2.2 --> update cmnCharCnt[] with min cnt of chars
            for(int ch = 0; ch < 26; ch++){ // O(1)
                cmnCharCnt[ch] = Math.min(cmnCharCnt[ch],currCharCnt[ch]);
            }
        }

        // step 3 --> add to ans list
        for(int idx = 0; idx < 26; idx++){
            while(cmnCharCnt[idx] > 0){ // o(K)
                ans.add(String.valueOf((char)(idx + 'a'))); // I did mistake that instead of adding +a, I substract it with a.
                cmnCharCnt[idx]--;
            }
        }
        return ans;
    }
}
