class Solution {
    public boolean isValid(String word) {
        int n = word.length();

        if(n < 3){
            return false;
        }

        boolean countConsonent = false;
        boolean countVowel = false;

        for(int idx = 0; idx < n; idx++){
            Character ch = word.charAt(idx);
            ch = Character.toLowerCase(ch);
            if(ch == '@' || ch == '#' || ch == '$'){
                return false;
            }else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                countVowel = true ;
            }else if(!Character.isDigit(ch)){
                countConsonent = true ;
            }
        }

        return ( countConsonent && countVowel  ) ? true : false; 
    }
}