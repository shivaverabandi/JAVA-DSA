class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int ans = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);

        int n = players.length, m = trainers.length;
        int playerIndex = n - 1 , trainerIndex = m - 1;
        while(playerIndex >= 0 && trainerIndex >= 0){
            if(players[playerIndex] <= trainers[trainerIndex]){
                ans += 1;
                playerIndex--;
                trainerIndex--;
            }else{
                playerIndex--;
            }
        }
        return ans;
    }
}