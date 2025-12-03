class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
       
        int i=0;
         int j = s.length()-i-1;

       while(i<j) {

if(Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(j) )){
    char c = sb.charAt(i);
    sb.setCharAt(i,sb.charAt(j));
   sb.setCharAt(j,(c));

j--;
i++;
}
else if(Character.isLetter(s.charAt(i))){
    j--;
}

else if (  Character.isLetter(s.charAt(j) ) ){
    i++;
}

else {
    i++;
    j--;
}

        }
   
  return sb.toString(); 
   
    }
}