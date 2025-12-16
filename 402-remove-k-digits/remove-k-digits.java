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
int index =-1;
 for(int i = 0 ;i<=sb.length()-1;i++){
    if(sb.charAt(i)!='0')
    {index=i;
    break;}
 } 
if(index==-1){return "0";}
if(index>0){
    sb.replace(0,index,"");
}


 return sb.toString();

    }
}