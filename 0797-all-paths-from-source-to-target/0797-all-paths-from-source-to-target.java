class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> path = new ArrayList<>();
        ans.add(0);
        dfs(0, path,ans, graph );
        return path;
    }
    private void dfs(int node, List<List<Integer>> path, List<Integer> ans, int[][] graph){
        if(node == graph.length-1){
            path.add(new  ArrayList<>(ans));
        }
        for(int ne : graph[node]){
            ans.add(ne);
            dfs(ne, path, ans, graph);
            ans.remove(ans.size()-1);

        }
    }
}