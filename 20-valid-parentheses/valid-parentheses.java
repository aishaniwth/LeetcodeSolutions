class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack <>();
        if(s.length()<2){return false;}
        String close = "}])";
        for(int i = 0 ; i <s.length() ; i++){
        if (!st.isEmpty() && close.indexOf(s.charAt(i)) > -1 ){
      if(s.charAt(i)==')' ) { 
        if(st.peek()=='(') 
       st.pop(); 
      else{return false;} }  
      
  else if(s.charAt(i)=='}' ) { 
        if(st.peek()=='{') 
       st.pop(); 
      else{return false;} }  

else if(s.charAt(i)==']' ) { 
        if(st.peek()=='[') 
       st.pop(); 
      else{return false;} }  

      
      
      } else st.push(s.charAt(i));

        } return st.isEmpty();

    } 
}