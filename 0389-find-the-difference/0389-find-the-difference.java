class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> res = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char c1 = s.charAt(i);
            res.put(c1,res.getOrDefault(c1,0)+1);
        }
    for(int i = 0; i<t.length();i++){
        char c2 = t.charAt(i);
        if(!res.containsKey(c2)){
            return c2;
        }
        else{
            res.put(c2, res.get(c2)-1);
            if(res.get(c2) == 0){
                res.remove(c2);
            }
        }
    }
        return ' ';

    }
}