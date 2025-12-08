class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack <Integer> st = new Stack();
for(int i =0 ; i<s.length();i++){
    if(!st.isEmpty() &&  s.charAt(st.peek())=='(' && s.charAt(i)==')' ){
        st.pop();
    }
else  {
    if(s.charAt(i)==')' || s.charAt(i)=='('){
        st.push(i);
    }
    else {continue;}

};


}


StringBuilder sb = new StringBuilder ();
for(int i =s.length()-1 ; i>=0;i--){
    if(!st.isEmpty() && i==st.peek()) {st.pop();}
    else{
        sb = sb.append(s.charAt(i));
    }
}
return sb.reverse().toString();
    }
}