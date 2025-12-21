class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int[] ans = new int [k];
        int l = ans.length-1;
        Stack <Integer> st = new Stack <>();
        for(int i = 0 ; i < nums.length ; i++){
while(!st.isEmpty() && nums[st.peek()]> nums[i] && (k-st.size() < nums.length-i)         ){
    st.pop();
}
if(st.size() < k ){
    st.push(i);
}

     


}        
        
        
        while(!st.isEmpty()){
            
            ans[l]=nums[st.pop()];
            l--;
        } return ans ;
    }
}