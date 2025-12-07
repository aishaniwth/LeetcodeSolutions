class Solution {
    public int romanToInt(String s) {
      Map<Character, Integer> map = new HashMap <> ();
      map.put('I' , 1);
      map.put('V' , 5);
      map.put('X' , 10);
      map.put('L' , 50);
      map.put('C' , 100);
      map.put('D' , 500);
      map.put('M' , 1000);

Stack  <Character>st  = new Stack <> ();
int res =map.get(s.charAt(s.length()-1));
for (int i =s.length()-1 ; i >=0 ; i-- ){
    if(!st.isEmpty()) {
  if(map.get(st.peek()) > map.get(s.charAt(i)) ) {
res = res - map.get(s.charAt(i)) ;}
else {
    res = res + map.get(s.charAt(i));
}
    }

    

    st.push(s.charAt(i));



}
return res;





    }
}