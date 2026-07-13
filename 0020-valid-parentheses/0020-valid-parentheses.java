class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char ob : s.toCharArray()) {
            if (ob == '(' || ob == '{' || ob == '[') {
                st.push(ob);
            } else {
                if (st.isEmpty())
                    return false;
                char top = st.pop();
                if (ob == ')' && top != '(')
                    return false;
                if (ob == '}' && top != '{')
                    return false;
                if (ob == ']' && top != '[')
                    return false;
            }
        }
        return st.isEmpty();
    }
}