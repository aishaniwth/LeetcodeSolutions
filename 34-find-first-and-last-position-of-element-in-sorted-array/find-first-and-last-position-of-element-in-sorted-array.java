class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0 ;
        int ans=-1; 
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2 ; 
//first 
if(nums[mid]==target){
    ans=mid;
    high=mid-1;
}
else if (nums[mid]>target){
    high=mid-1;
}
else low=mid+1;




        }

 low = 0 ;
        int last =-1; 
         high = nums.length-1;
while(low<=high){
            int mid = low + (high-low)/2 ; 
//first 
if(nums[mid]==target){
    last=mid;
    low=mid+1;
}
else if (nums[mid]>target){
    high=mid-1;
}
else low=mid+1;




        }



return new int [] {ans,last};


    }
}