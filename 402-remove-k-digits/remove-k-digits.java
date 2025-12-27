class Solution {
    public String removeKdigits(String num, int k) {
        Stack <Character> st = new Stack <> ();
        char ch [] = num.toCharArray();
        
        if(k == num.length()){return "0";}
for(int i = 0 ; i<ch.length;i++){
    while(!st.isEmpty() && st.peek() >  ch[i] && k>0){
        k--;
        st.pop();
    }
   
    st.push(ch[i]);

}
if(k>0){
    while(k>0){
        st.pop();
        k-- ;
    }
}

StringBuilder sb = new StringBuilder ();
while(!st.isEmpty()){
    sb.append(st.pop());
}
sb.reverse();

while( sb.length()>1 &&  sb.charAt(0)=='0' ) {
    sb.deleteCharAt(0);
}

return sb.toString();

    }
}