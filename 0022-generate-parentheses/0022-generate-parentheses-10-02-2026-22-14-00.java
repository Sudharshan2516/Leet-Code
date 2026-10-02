class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> Result = new ArrayList<>();
        generate(0,0,n,"",Result);
        return Result;
    }
    private void generate(int open, int close, int n, String Crnt, List<String> Result){
        if(open + close == 2*n && open == close){
            Result.add(Crnt);
            return;
        }
        if(open < n){
            generate(open+1, close, n, Crnt+'(', Result);
        }
        if(open > close){
            generate(open , close+1, n, Crnt+')', Result);
        }
    }
}