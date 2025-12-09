class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack <> ();
        //int [] res = new int [prices.length];
       for(int i = 0 ;i<prices.length;i++){
        while(!st.isEmpty() && prices[st.peek()]>=prices[i]){
            prices[st.peek()] = prices[st.peek()]-prices[i];
            st.pop();

        }
        st.push(i);
        //res[i] = prices[i];
       } 
        return prices ;
    }
}