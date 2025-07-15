class Solution {
    public boolean isValid(String word) {
        int n = word.length();

        if(n < 3){
            return false;
        }

        int countConsonent = 0;
        int countVowel = 0;
        int digits = 0;

        for(int idx = 0; idx < n; idx++){
            Character ch = word.charAt(idx);
            ch = Character.toLowerCase(ch);
            if(ch == '@' || ch == '#' || ch == '$'){
                return false;
            }else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                countVowel++;
            }else if(Character.isDigit(ch)){
                digits++;
            }else{
                countConsonent++;
            }
        }

        return ( countConsonent > 0 && countVowel > 0 ) ? true : false; 
    }
}