class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack <>();
        st.push(0);
        int res = 0;
        int ans =0;
        for (int i =0 ; i<s.length();i++){

            if(s.charAt(i)=='('){
                st.push(0);
            }
            else{
               int n = st.pop();
               if(n==0){res=1;}else{res=2*n;}
                ans=res+st.pop();
                st.push(ans);

            }
            
            } return st.peek() ;
        }
    }
