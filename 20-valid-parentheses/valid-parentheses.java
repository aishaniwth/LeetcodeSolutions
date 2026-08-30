class Solution {
    public boolean isValid(String s) {

Set<Character> open = new HashSet<>();
open.add('(') ;
open.add('{');
open.add('[');

Set<Character> close = new HashSet<>();
close.add(')') ;
close.add('}');
close.add(']');

Stack <Character> st = new Stack <> ();

for(int i =0 ; i <s.length();i++){
if(  open.contains(s.charAt(i)) ){
    st.push(s.charAt(i));
    continue;
}

if(close.contains(s.charAt(i)) && !st.isEmpty()){
    if(  (st.peek()=='{' && s.charAt(i)=='}' )  ||   (st.peek()=='[' && s.charAt(i)==']' )  ||
    
    
    (st.peek()=='(' && s.charAt(i)==')' )    ){
        st.pop();
    } else {st.push(s.charAt(i));}
} else {
    st.push(s.charAt(i));
} 



}
 return st.isEmpty();
        
    }
}