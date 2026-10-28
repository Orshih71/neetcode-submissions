class Solution {

    Set<Integer> existSet = new HashSet<>();
    Map<Integer, Integer> visitedMap = new HashMap<>();

    public int findConcecutiveLength(int num){
        if(!existSet.contains(num)){
            return 0;
        }
        if(visitedMap.containsKey(num)) {
            return visitedMap.get(num);
        }
        int len = 0;
        int curr = num;
        while (existSet.contains(curr)) {
            if (visitedMap.containsKey(curr)) {
                len += visitedMap.get(curr);
                break;
            }
            len++;
            curr++;
        }
        visitedMap.put(num, len);
        return len;
    }

    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        for(int i: nums){
            existSet.add(i);
        }

        int max = 0;
        for(int i: nums){
            if(!existSet.contains(i - 1)) {
                max = Math.max(findConcecutiveLength(i), max);
            }
        }
        return max;
    }
}
