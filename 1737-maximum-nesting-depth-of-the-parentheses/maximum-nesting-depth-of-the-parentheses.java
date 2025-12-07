class Solution {
    public int maxDepth(String s) {


int temp =0;
char o = '(' ;
char c=')';

Stack <Character> st = new Stack <>();
for(int i = 0 ; i<s.length() ;i++ ){
if(s.charAt(i)==o){
    st.push(s.charAt(i));
  
}
if(s.charAt(i)==c){
    temp = Math.max(st.size() , temp) ;
    st.pop();
   
}

}

return temp ;
        
    }
}