class Solution {
    private int time = 0;
    
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] parent = new int[n];
        int[] disc = new int[n];
        int[] low = new int[n];
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
            parent[i] = -1;
            disc[i] = -1;
            low[i] = -1;
        }
        
        for(List<Integer> edge: connections) {
            adj.get(edge.get(0)).add(edge.get(1));
            adj.get(edge.get(1)).add(edge.get(0));
        }
        
        List<List<Integer>> criticals = new ArrayList<>();
        dfs(adj, criticals, disc, low, parent, 0);
        
        return criticals;
    }
    
    private void dfs(List<List<Integer>> adj, List<List<Integer>> criticals, int[] disc, int[] low, int[] parent, int u) {
        disc[u] = time;
        low[u] = time;
        time++;
        
        for(int v: adj.get(u)){
            if(disc[v]==-1) {
                parent[v] = u;
                dfs(adj,criticals, disc,low,parent,v);
                low[u] = Math.min(low[u], low[v]);
                
                if(low[v]>disc[u]){
                    criticals.add(Arrays.asList(u,v));
                }
            } else if(parent[u]!=v) {
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }
}