class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = (int) 2e9;
        int minHours = right;
        while (left <= right) {
            int middle = (left+right)/2;
            long hours = 0;
            for (int i = 0; i < piles.length; i++) {
                hours += Math.ceilDiv(piles[i], middle);
            }
            if (middle == 1) {
                System.out.println(hours);
            }
            if (hours <= h) {
                minHours = Math.min(minHours, middle);
                right = middle - 1;
            } else {
                left = middle + 1;
            } 
        }
        return minHours;
    }
}
