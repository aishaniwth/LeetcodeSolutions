class Solution {
    public int missingInteger(int[] nums) {
        int p = nums[0] ; 

       
        for(int i = 0 ; i < nums.length-1 ; i ++){
           if(nums[i+1] == nums[i]+1){
p=p+nums[i+1] ; 
           } else break;

        } Map <Integer, Integer > map = new HashMap<> ();
        int x =p +1;
         for(int i = 0 ; i < nums.length ; i ++){
map.put(i, nums[i]);
         }
         if(!map.containsValue(p)){
            return p ;
         }
         else {


while(map.containsValue(x)){
    
x++;

}



         } return x ;
    }
}