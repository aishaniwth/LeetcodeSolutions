class Solution {
    public int reverse(int x) {
        

StringBuilder sb = new StringBuilder(String.valueOf(x));
sb.reverse();
if(x<0){
sb.deleteCharAt(sb.length()-1);
sb.insert(0,"-");
}

int rev=0;
try{
    rev=Integer.parseInt(sb.toString());
    return rev;
} catch(Exception e){
    return 0;
}





    }
}