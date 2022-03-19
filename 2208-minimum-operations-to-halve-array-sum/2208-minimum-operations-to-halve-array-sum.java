class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<Double>(Collections.reverseOrder());
        
        double sum = 0.0;
        for(int n : nums){
            sum += (double)n;
            pq.add((double)n);
        }
        double tot = sum;
        int count = 0;
        while(tot > sum/2){
            double p = pq.poll()/2;
            pq.add(p);
            tot -= p;
            count++;
        }
        return count;
    }
}