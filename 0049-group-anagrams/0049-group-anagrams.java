class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> grp = new HashMap<>();

        for(String s : strs){

            int []frChar = new int[26];
            char []chArr = s.toCharArray();

            for(char ch : chArr){
                frChar[ch -'a']++;
            }

            StringBuilder sbKey = new StringBuilder();
            for(int fr : frChar){
                sbKey.append(fr).append('#'); // I have made mistake that will generate same hash for two diff strings
            }

            String key = sbKey.toString();
            if(!grp.containsKey(key)){
                grp.put(key, new ArrayList<>());
            }
            grp.get(key).add(s);

        } 

        for(List<String> list : grp.values()){
            ans.add(list);
        }
        return ans;
    }



    public List<List<String>> groupAnagrams2(String[] strs) {

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