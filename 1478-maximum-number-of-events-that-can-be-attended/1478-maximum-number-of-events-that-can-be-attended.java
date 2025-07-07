class Solution {
    public int maxEvents(int[][] events) {
        
        int n = events.length, day = 0, ans = 0, idx = 0;

        // sort the start days.
        Arrays.sort(events, (a,b) -> Integer.compare(a[0],b[0]));

        PriorityQueue<Integer> endDays = new PriorityQueue<>();

        while(!endDays.isEmpty() || idx < n){

            if(endDays.isEmpty()){ // is EndDays are empty then there is new Schedule
                day = events[idx][0]; // start day
            }

            // Here check the current start day with day. we have to add events endDay that are have startDay or lesser than startDay.
            while(idx < n && events[idx][0] <= day){ 
                endDays.offer(events[idx][1]);      
                idx++;
            }

            endDays.poll();
            ans++; // count the events based on smallest endDay from endDays( PriorityQueue)
            day++;

            while(!endDays.isEmpty() && endDays.peek() < day){ // removing the endDays or the days which are not able to attend.
                endDays.poll();
            }

        }

        return ans;

    }
}