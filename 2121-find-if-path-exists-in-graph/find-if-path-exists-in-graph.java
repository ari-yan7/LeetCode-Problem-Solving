class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            list.get(u).add(v);
            list.get(v).add(u);
        }
        boolean [] visited = new boolean [n];
        boolean found = dfs(list, source, destination, visited);
        return found;
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> list, int current, int destination, boolean [] visited) {
        visited[current] = true;
        if (current == destination) return true;
        for (int other : list.get(current)) {
            if (!visited[other]) {
                boolean found = dfs(list, other, destination, visited);
                if (found) return true;
            }
        }
        return false;
    }
}