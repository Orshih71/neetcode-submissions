class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i: nums){
            pq.add(i);
        }
        
        int prev = pq.peek();
        int max = 0;
        int count = 1;
        while(!pq.isEmpty()){
            int c = pq.poll();
            System.out.println(c);
            if(c == prev) continue;
            if(c == prev + 1){
                count++;
                prev = c;
            }
            else {
                if(count > max) max = count;
                count = 1;
                prev = c;
            }
        }
        if(count > max) max = count;
        return max;


    }
}
