class Solution {
    public int trap(int[] h) {
        
        int ans=0;
        int curr=0;
        Stack<Integer> st=new Stack<>();
        while(curr<h.length){
            while(!st.isEmpty() && h[curr]>h[st.peek()]){
                int top=st.peek();
                st.pop();
                if(st.isEmpty())
                    break;
                int dist=curr-st.peek()-1;
                int bound_h=Math.min(h[curr],h[st.peek()])-h[top];
                ans+=dist*bound_h;
                
            }
            st.push(curr++);
        }
        return ans;
     }
     
  }
