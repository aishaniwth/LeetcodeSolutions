class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> st = new Stack <> ();
        boolean small = false;
        for(int i = 0 ; i < asteroids.length ; i++){

while(!st.isEmpty() && st.peek()>0 && asteroids[i]<0 && st.peek()<-1*asteroids[i]){

    st.pop();
} 

if(!st.isEmpty()&&st.peek()>0 && asteroids[i]<0 && st.peek()==-1*asteroids[i]){st.pop();continue;}
if(!st.isEmpty()&&st.peek()>0 && asteroids[i]<0 && st.peek()>-1*asteroids[i]){continue;}

st.push(asteroids[i]);


        }
int [] ans = new int [st.size()];
int l =ans.length-1;
while(!st.isEmpty()){
    ans[l]=st.pop();
    l--;
}
return ans;
    }
}