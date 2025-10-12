class MedianFinder {
     PriorityQueue<Integer> max = new PriorityQueue<>((a,b)->b-a); // smaller half
        PriorityQueue<Integer> min = new PriorityQueue<>();

    public MedianFinder() {
         
    }
    
    public void addNum(int i) {
          if (max.isEmpty() || i <= max.peek()) {
                max.add(i);
            } else {
                min.add(i);
            }

            if (max.size() > min.size() + 1) {
                min.add(max.poll());
            } else if (min.size() > max.size()) {
                max.add(min.poll());
            }
    }
    
    public double findMedian() {
         
        if (max.size() == min.size()) {
                return ((max.peek() + min.peek()) / 2.0);
            } else {
                return(double) max.peek();
            }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */