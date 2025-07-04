class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans ;
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){

            char []chars = s.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars); // converting array of chars to string.
            // if the key is not seen until, then we have to create a list to store those grps of anagrams.
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            // addding string to list
            map.get(key).add(s);

        }

        ans = new ArrayList<>(map.values());
        return ans;

    }
}