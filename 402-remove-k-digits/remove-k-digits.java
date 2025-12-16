class Solution {
    public String removeKdigits(String num, int k) {
        Stack <Integer> st = new Stack <> ();


if(k==num.length()){return "0" ;}
StringBuilder sb = new StringBuilder();




for (int i = 0 ; i <num.length(); i++){
int a = num.charAt(i)-'0';
while(!st.isEmpty() && st.peek() > a && k>0){
st.pop();
k--;

} st.push(a);

}
if (k>0 ) {
    while(k>0){
        st.pop();
        k--;
    }




}




while(!st.isEmpty() ) {
sb.append(Integer.toString(st.pop() ));
}

sb.reverse();
while(sb.length()>0  && sb.charAt(0)=='0'){
    sb.deleteCharAt(0);
}

if(sb.length()==0){return "0";}
 return sb.toString();

    }
}