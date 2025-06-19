class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> smap = new HashMap<>();
        // Map<Character,Boolean> isMapped = new HashMap<>();
        // Because we use containsValue(value) method to check is t[i] mapped earlier.
        int len = s.length();
        for(int i = 0; i<len; i++){
            Character schar = s.charAt(i);
            Character tchar = t.charAt(i);
            if(smap.containsKey(schar)){
                if(smap.get(schar) != tchar){
                    return false;
                }
            }else{
                if(smap.containsValue(tchar)){
                    return false;
                }
                smap.put(schar,tchar);
            }
        }
        return true;
    }
}