class Solution {
    public int maxEvents(int[][] events) {
        // Sort events by their start day
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));

        // Min-heap to store events based on their end day
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int day = 1, i = 0, n = events.length;
        int maxDay = 0;
        
        // Determine the last day from all events
        for (int[] event : events) {
            maxDay = Math.max(maxDay, event[1]);
        }

        int attended = 0;

        // Loop through each day
        for (day = 1; day <= maxDay; day++) {
            // Add events starting today
            while (i < n && events[i][0] == day) {
                minHeap.offer(events[i][1]);
                i++;
            }

            // Remove expired events
            while (!minHeap.isEmpty() && minHeap.peek() < day) {
                minHeap.poll();
            }

            // Attend the event that ends earliest
            if (!minHeap.isEmpty()) {
                minHeap.poll();
                attended++;
            }
        }

        return attended;
    }
}