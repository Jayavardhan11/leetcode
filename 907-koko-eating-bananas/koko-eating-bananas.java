class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end =  findMax(piles);
        while(start <= end){
            int mid = (start + end) / 2;
            int totalH = calculateTotalHours(piles, mid);
            if (totalH <= h) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
        
    }
     public  int findMax(int[] v) {
        int maxi = Integer.MIN_VALUE;;
        int n = v.length;
        //find the maximum:
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, v[i]);
        }
        return maxi;
    }

    public int calculateTotalHours(int[] v, int hourly) {
        int totalH = 0;
        int n = v.length;
        //find total hours:
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double)(v[i]) / (double)(hourly));
        }
        return totalH;
    }
}