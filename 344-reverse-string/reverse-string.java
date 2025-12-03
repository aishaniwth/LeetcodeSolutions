class Solution {
    public void reverseString(char[] s) {

 swap(0,s);



        
    }

public void swap(int i , char[]arr){
    if(i==arr.length/2) return;
    char temp =  arr[i];
    arr[i]=arr[arr.length-i-1];

    arr[arr.length-i-1] = temp;
    i++;
    swap(i,arr);

}

}