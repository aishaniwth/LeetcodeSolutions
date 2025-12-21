class Solution {
    public String removeDigit(String number, char digit) {
        int count = -1;
        boolean visit ; 
        StringBuilder sb = new StringBuilder(number);
        char  [] num = number.toCharArray();
        for(int i = 0 ; i < num.length;i++){
            if(num[i]==digit){
                if (i < num.length-1 ) {
                if( num[i+1]>num[i] ){
sb.deleteCharAt(i);
return sb.toString();
                }else {
 count=Math.max(count , i); 

                }
            }
            } 
        }
      if( num[number.length()-1]==digit){
return sb.deleteCharAt(number.length()-1).toString();
      } return sb.deleteCharAt(count).toString();
    }
}