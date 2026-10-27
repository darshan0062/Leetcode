class MinStack {
  Stack <Integer> s =new Stack<>();
         Stack <Integer> st =new Stack<>();
    public MinStack() {
       
        
    }
    
    public void push(int value) {
        s.push(value);
        if(st.isEmpty()){
            st.push(value);
        }else{
            if(st.peek()>=value){
                st.push(value);
            }
        }
    }
    
    public void pop() {
     int a =  s.pop();
       if(st.peek()==a){
        st.pop();
       }
       
    }
    
    public int top() {
      return  s.peek();
    }
    
    public int getMin() {
      return  st.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */