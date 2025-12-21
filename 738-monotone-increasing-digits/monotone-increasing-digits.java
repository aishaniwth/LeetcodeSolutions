class Solution {
    public int monotoneIncreasingDigits(int n) {
//3442543899

        char [] num = String.valueOf(n).toCharArray();
        for(int i=num.length-1 ; i>0 ; i--){
            if(num[i] < num[i-1] ){
                num[i-1]--;
                for(int j = i ; j< num.length ; j++){
                    num[j]='9';
                } 

            }
        } return Integer.parseInt(new String(num));
        
    }
}