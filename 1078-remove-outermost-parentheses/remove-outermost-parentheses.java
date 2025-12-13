class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int depth =0 ;
    for(int i = 0 ; i < s.length(); i++){
        if(s.charAt(i)=='('){
depth++;
        }
      if(s.charAt(i)==')'){
depth--;
        }
if(depth==0 && s.charAt(i)==')' || depth==1 && s.charAt(i)=='('){
    continue ;
}
sb.append(s.charAt(i));


    }
        return sb.toString();
    }
}