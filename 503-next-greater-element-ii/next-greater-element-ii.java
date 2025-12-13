class Solution {
    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> st = new Stack <> ();
        int [] res = new int [nums.length];
        for(int i = 0 ; i<nums.length;i++){
            res[i]=-1;
        }
        for (int j = 0 ; j < 2*nums.length-1 ; j++){
            int i = j%nums.length ; 

            while(!st.isEmpty() && nums[st.peek()] < nums[i]){
                    res[st.peek()]=nums[i];
                    st.pop();
            } st.push(i);
        }
        return res ;
    }
}