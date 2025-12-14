class Solution {
    public int[] canSeePersonsCount(int[] heights) {
Stack <Integer> st = new Stack <> ();

int [] res = new int [heights.length];
for(int i =0 ; i < heights.length;i++){
while(!st.isEmpty() && heights[st.peek()] < heights[i] ){
   res[st.pop()]++;
}

if(!st.isEmpty()){
    res[st.peek()]++;

}
st.push(i);




}

return res;

    }
}