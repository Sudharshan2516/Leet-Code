class Solution {
    public boolean isValid(String s) {
        Stack<Character> pc = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('|| c == '[' || c == '{'){
                pc.push(c);
            }
            else{
                if(pc.isEmpty()){
                    return false;
                }
                char tp = pc.pop();
                if(c == ')' && tp != '(') return false;
                if(c == ']' && tp != '[') return false;
                if(c == '}' && tp != '{') return false;
            }
           
        }
         return pc.isEmpty();
    }
}