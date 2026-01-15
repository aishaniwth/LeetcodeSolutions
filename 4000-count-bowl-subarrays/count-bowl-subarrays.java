class Solution {
    public long bowlSubarrays(int[] nums) {
        Stack <Integer> st = new Stack <>();
int nge []= new int [nums.length];
int pge []= new int [nums.length]; 
int count=0;
for(int i = 0 ; i <nums.length;i++){
nge[i]=-1;
pge[i]=-1;
}

for(int i = 0 ; i < nums.length;i++ ){
while (!st.isEmpty() && nums[st.peek()] < nums[i]){
nge[st.pop()]=i;
}
st.push(i);


}
st.clear();

for(int i = nums.length-1 ; i >=0; i--){
while (!st.isEmpty() && nums[st.peek()] < nums[i]){
pge[st.pop()]=i;
}
st.push(i);


}

for(int i = 0 ; i <nums.length;i++){

if(nge[i]+pge[i] >=2 && nge[i]!=-1 && pge[i]!=-1) {count++;}

}

return count ;

        
    }
}