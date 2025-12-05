class Solution {
    public int firstUniqChar(String s) {
        
        Map <Character , Integer> map =new LinkedHashMap<> ();
        for(char c : s.toCharArray()){

map.put(c,map.getOrDefault(c,0)+1);


        }
for(Map.Entry<Character,Integer> x: map.entrySet()){
    if(x.getValue()==1){
        return s.indexOf(x.getKey());
    }
}
return -1;


    }
}