class Solution {
    public int longestPalindrome(String s) {
int counter=0;
int max = 0;
boolean odd= false;
Map <Character , Integer> map = new HashMap<>();
for(int i = 0 ; i<s.length(); i++){
    map.put(s.charAt(i) , map.getOrDefault(s.charAt(i),0)+1) ;

}
for (Map.Entry<Character,Integer> x : map.entrySet()){

if(x.getValue()%2==0){
    counter=counter+ x.getValue();
}
else {
counter=counter+ x.getValue()-1;
odd=true;
}


}

if(odd){
    return counter+1;
}
return counter;
   
        
    }
}