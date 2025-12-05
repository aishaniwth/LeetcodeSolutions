class Solution {
    public char findTheDifference(String s, String t) {
if(t.length()==1) return t.charAt(0);
Map <Character, Integer> map = new HashMap <> () ;

for(int i =0 ; i<t.length();i++){
map.put(t.charAt(i) , map.getOrDefault(t.charAt(i) , 0)+1);
}

for(int i =0 ; i<s.length();i++){
if(map.containsKey(s.charAt(i) )){
map.put(s.charAt(i) , map.get(s.charAt(i))-1) ;




}
if( map.containsKey(s.charAt(i))   && map.get(s.charAt(i))==0    ){
    map.remove(s.charAt(i));
}



}

for(Map.Entry<Character, Integer> x : map.entrySet() ) {
    return x.getKey();
}



return 'a';
        
    }
}