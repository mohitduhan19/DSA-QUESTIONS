class MedianFinder {
    private  PriorityQueue<Integer> min;
    private  PriorityQueue<Integer> max;
    public MedianFinder() {
     min = new PriorityQueue<>();
     max = new PriorityQueue<>(Collections.reverseOrder());

    }
    
    public void addNum(int num) {
        if(max.size() == 0 || max.peek() > num){
            max.add(num);
        }else{
            min.add(num);
        }
        balance();
    }
    
    public double findMedian() {
        if(max.size() > min.size()){
            return max.peek();
        }else if(min.size() > max.size()){
            return min.peek();
        }
        return (max.peek() + min.peek())/2.0;
    }
    public void balance(){
        if((max.size() - min.size()) > 1){
            min.add(max.remove());
        }else if(min.size() - max.size()> 1){
            max.add(min.remove());
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */