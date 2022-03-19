class FreqStack {
    HashMap<Integer , Stack<Integer>> stk;
    HashMap<Integer , Integer> fmap;
    int maxfreq;
    public FreqStack() {
        stk = new HashMap<>();
        fmap = new HashMap<>();
        maxfreq = 0;
    }
    
    public void push(int val) {
        int currfreq = fmap.getOrDefault(val , 0);
        currfreq++;
        fmap.put(val , currfreq);
        
        if(stk.containsKey(currfreq) == false){
            stk.put(currfreq , new Stack<Integer>());
        }
        
        stk.get(currfreq).add(val);
        maxfreq = Math.max(maxfreq , currfreq);
    }
    
    public int pop() {
        int ans = stk.get(maxfreq).pop();
        int crf = fmap.get(ans);
        crf--;

        fmap.put(ans , crf);
        if(stk.get(maxfreq).size() == 0){
            maxfreq--;
        }
        return ans;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */