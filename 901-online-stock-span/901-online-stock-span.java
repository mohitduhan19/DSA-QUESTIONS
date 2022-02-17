class StockSpanner {
    class pair{
        int price;
        int index;
    }
    int indexing = 0;
    Stack<pair>stk;

    public StockSpanner() {
       stk = new Stack<>();
        pair base = new pair();
        base.price = 1000000;
        base.index = -1;
        stk.push(base);
    }
   
    public int next(int price) {
      pair p = new pair();
      p.price = price;
        p.index = indexing;
        indexing++;
        
        while(stk.peek().price <= p.price){
            stk.pop();
        }
        int ans = p.index - stk.peek().index;
        stk.push(p);
        return ans;
     
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */