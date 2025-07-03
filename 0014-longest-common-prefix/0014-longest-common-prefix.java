class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        String str1 = strs[0];
        StringBuilder ans = new StringBuilder();
        for(int idx = 0; idx < str1.length(); idx++){
            boolean flag = true;
            // check that curr char is present in remaining strings in array
            for(int j = 1; j < strs.length; j++){
                if(idx >= strs[j].length() || str1.charAt(idx) != strs[j].charAt(idx)){
                    flag = false;
                    break;
                }
            }
            // if present then add to ans string
            if(flag == true){
                ans.append(str1.charAt(idx));
            }else{
                break;
            }
        }

        return ans.toString();
    }
}