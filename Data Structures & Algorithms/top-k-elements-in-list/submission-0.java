class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry e: map.entrySet()){
            pq.add(e);
        }
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = pq.poll().getKey();
        }
        return res;

    }
}
