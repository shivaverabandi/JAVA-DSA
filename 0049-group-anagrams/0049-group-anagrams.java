class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>() ;
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){ // o(N) Overall Time Complexity is O(N * S*logS)

            char []chars = s.toCharArray(); // o(S)
            Arrays.sort(chars); // o(s*logs) length of String S

            String key = new String(chars); // converting array of chars to string. 
            // if the key is not seen until, then we have to create a list to store those grps of anagrams.
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            // addding string to list
            map.get(key).add(s);

        }

        for(List<String> list : map.values()){
            ans.add(list);
        }
        return ans;

    }
}
