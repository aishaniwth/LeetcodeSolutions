class Solution {
    public int[] twoSum(int[] nums, int target) {


Map<Integer , Integer> map = new HashMap<>();
for(int i =0 ; i<nums.length;i++){
int add = target -  nums[i];
if(map.containsKey(add)){

return new int [] {(int)map.get (Integer.valueOf(add)) , i};
}

map.put(nums[i],i);


}

return new int []{};

        
    }
}