class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      
        int [] ans1 = new int [nums1.length] ; 
Stack <Integer> st = new Stack <> ();
Map<Integer , Integer > map = new HashMap <> () ;
for(int i =0 ;i < nums2.length ; i ++){
    while(!st.isEmpty() && nums2[st.peek()] < nums2[i]       ) {
        
        map.put(nums2[st.peek()] , nums2[i]) ; 
        st.pop();
    }

    st.push(i);
    
    //map.put(nums2[i] , -1) ; 
}

for(int i =0 ; i<nums1.length ; i++ ){
    ans1[i] = map.getOrDefault(nums1[i] ,  -1);
}

return ans1;

    }
}