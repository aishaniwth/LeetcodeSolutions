class Solution {
    public int mostFrequentEven(int[] nums) {
  Map<Integer,Integer> map = new HashMap<>();
  for(int i =0 ;i<nums.length;i++){
    if(nums[i]%2==0){
        map.put(nums[i], map.getOrDefault(nums[i] , 0)+1);
    }
  } 
  if(map.isEmpty()) {return -1;} 
int max = -1;
int ans = Integer.MAX_VALUE;
for(Integer key : map.keySet()){
if(map.get(key) > max) {
    max= map.get(key);
    ans= key;
}
else if (map.get(key) == max){
    ans = Math.min ( ans  , key);
}
else {continue;}
}
 return ans;


    }
}