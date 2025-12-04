class Solution {
    public int singleNumber(int[] nums) {
    int counter =1;        
Map <Integer,Integer> map = new HashMap <> ();
for (int i =0;i<nums.length;i++){
if(map.containsKey(nums[i])){
    map.put(nums[i],++counter);
} else {
    counter=1;
map.put(nums[i],counter);

}

}
 for(Map.Entry<Integer,Integer> e : map.entrySet()){
    if(e.getValue()==1){
        return e.getKey();
    }
 }
return 0;

    }
}