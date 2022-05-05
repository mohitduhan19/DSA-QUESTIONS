class MyStack {

   Queue <Integer> q = new LinkedList<>();
  
    public void push(int x) {     
      q.add(x);
      for(int i = 1; i < q.size(); i ++)
        q.add(q.poll());
    }
    
    public int pop() {           
      return q.poll();  
    }
    
    public int top() {            
      return q.peek();  
    }
    
    public boolean empty() {    
      return q.isEmpty();  
    }
}