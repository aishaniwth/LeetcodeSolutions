class Solution {
    public boolean wordPattern(String pattern, String s) {
String [] mod = s.split("\\s");
if (pattern.length() != mod.length ) {
    return false;
}


// Map <Character , Integer> mpat = new HashMap <>();
// Map <String , Integer> ms = new HashMap <>();
Map<Character, String> id = new HashMap <>();

char [] ch = pattern.toCharArray();
for(int i =0; i<mod.length;i++){

// mpat.put(ch[i], mpat.getOrDefault(ch[i],0)+1);
// ms.put(mod[i], ms.getOrDefault(mod[i],0)+1);

// if ( mpat.size() != ms.size() ) {return false;}


// else {
if(id.containsKey(ch[i])) {
    if(!id.get(ch[i]) .equals (mod[i])){
        return false;
    }
}

//else if (!id.containsKey(ch[i]))
else{
    if(id.containsValue(mod[i]) ){
        return false;
    }
    id.put(ch[i], mod[i]);
}







}

return true ;


    }
}