class Solution {
    public String removeDuplicateLetters(String s) {
    
        Stack <Integer> st = new Stack<>();
      HashMap<Character,Integer> map = new HashMap<>();
       HashSet<Character> set = new HashSet<>();
      for(int i=0;i<s.length();i++){
          map.put(s.charAt(i),i);
      }
     for(int i = 0 ;  i < s.length() ; i++){

if(set.contains(s.charAt(i))){continue;}
         while(!st.isEmpty() && s.charAt(st.peek()) > s.charAt(i) && i<map.get(s.charAt(st.peek())) ){

             set.remove(s.charAt(st.peek()));
             
             st.pop();
         }

         st.push(i);
         set.add(s.charAt(i));
     
           }


StringBuilder sb = new StringBuilder();
while( !st.isEmpty()){
    sb.append(s.charAt(st.pop() ) );
}
   return sb.reverse().toString();     
    }
}   
        
  