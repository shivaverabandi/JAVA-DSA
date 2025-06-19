class Solution {
    public boolean isIsomorphic(String s, String t) {
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