class Solution {
    public String makeGood(String s) {
        


        Stack<Character> st = new Stack<>();
        for(int i =0 ;i<s.length();i++){
            if(!st.isEmpty()){

if( Math.abs(st.peek()-s.charAt(i))==32  &&  Character.toLowerCase(st.peek() )==Character.toLowerCase(s.charAt(i))  )
  {
    st.push(s.charAt(i));
    st.pop();
    st.pop();
}

else{
    st.push(s.charAt(i));
}

            } else{
            st.push(s.charAt(i));
            }
        }

if(st.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb=sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}







    