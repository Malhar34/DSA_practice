class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (k < 1) {
            return new int[0];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums) { // builds the map with each number and the number of times it shows up
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        for (int key : map.keySet()) {
            pq.offer(key); // the PriorityQueue now takes this key and runs .get(Key) on it. 
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }
        return result;
    }
}
