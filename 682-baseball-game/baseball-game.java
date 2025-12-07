class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> st = new Stack <> ();
        int res = 0;
    for (int i =0 ; i<operations.length; i++){
        
        if(operations[i].equals("C") ) {
      st.pop();
        }
      else if(operations[i].equals("D"))    {
        st.push ( 2*st.peek());

      }
 else if(operations[i].equals("+"))    {
        
  int k = st.peek();
  int b ;
  st.pop();
  b = k + st.peek();
  st.push(k);
  st.push(b);

        
      }
      
else {
    st.push  (  Integer.parseInt(operations[i] )
    );
}

        }

while( !st.isEmpty()){
    res = res + st.peek();
    st.pop();
}


return res;
    



    }    
    }
