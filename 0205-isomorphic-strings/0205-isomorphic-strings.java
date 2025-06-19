class Solution {
    public boolean isIsomorphic1(String s, String t) { // Time 0(n^2)
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
                if(smap.containsValue(tchar)){ // This containsValue() --> takes O(n) time for check..!
                    return false;
                }
                smap.put(schar,tchar);
            }
        }
        return true;
    }

    public boolean isIsomorphic2(String s, String t) { // Time o(N)
        Map<Character,Character> smap = new HashMap<>();
        Map<Character,Boolean> isMapped = new HashMap<>();
        int len = s.length();
        for(int i = 0; i<len; i++){
            Character schar = s.charAt(i);
            Character tchar = t.charAt(i);
            if(smap.containsKey(schar)){
                if(smap.get(schar) != tchar){
                    return false;
                }
            }else{
                if(isMapped.containsKey(tchar) && isMapped.get(tchar)){
                    return false;
                }
                smap.put(schar,tchar);
                isMapped.put(tchar,true);
            }
        }
        return true;
    }
}
