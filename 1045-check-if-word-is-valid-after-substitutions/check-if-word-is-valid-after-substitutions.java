class Solution {
    public boolean isValid(String s) {
   Stack <Character> st =  new Stack <> () ;
for(int i = 0 ; i<s.length();i++){
if( st.size()>=2 && st.peek()=='b' && s.charAt(i)=='c' ) {
char se = st.pop();
    char f=st.pop();
    if(f!='a'){
        st.push(f);
        st.push(se);
        st.push(s.charAt(i));
    }

} else{st.push(s.charAt(i)); }

}

return st.isEmpty();
   
          
    }
}