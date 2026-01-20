class Solution {
    int [] result;
    int index = 0;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int arr[] : prerequisites) {
            adj.get(arr[0]).add(arr[1]);
        }
        int [] instack = new int[numCourses];
        int [] visited = new int[numCourses];
        result = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (dfs(adj, instack, visited, i)) {
                return new int[0]; 
            }
        }
        return result;
    }
    public boolean dfs(List<List<Integer>> adj, int [] instack, int [] visited, int i) {
        if (instack[i] == 1) return true;
        if (visited[i] == 1) return false;
        visited[i] = 1;
        instack[i] = 1;
        for (int n : adj.get(i)) {
            if (dfs(adj, instack, visited, n)) {
                return true;
            }
        }
        result[index++] = i;
        instack[i] = 0;
        return false;
    }
}