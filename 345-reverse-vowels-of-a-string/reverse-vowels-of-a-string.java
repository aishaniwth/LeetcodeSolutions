class Solution {
    public String reverseVowels(String s) {
    
String v ="aeiouAEIOU";
StringBuilder sb = new StringBuilder(s);
int i =0; int j = s.length()-1;
while(i<j){
if(v.indexOf(s.charAt(i)) >=0  && v.indexOf(s.charAt(j)) >=0 ) {
char c = s.charAt(i);

    sb.setCharAt(i,s.charAt(j));
    sb.setCharAt(j,c);
    i++;
    j--;
}
else if ( v.indexOf(s.charAt(i)) >=0 ) {j-- ;}
else if ( v.indexOf(s.charAt(j)) >=0  )  {i++;}
else {
    i++;
    j--;
}




}


return sb.toString();


        
    }
}