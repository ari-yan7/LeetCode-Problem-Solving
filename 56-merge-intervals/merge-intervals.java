class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1){
            return intervals;
        }
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        List<int[]>result = new ArrayList<>();
        int[]current = intervals[0];
        result.add(current);
        int j = 0;
        for (int i = 1; i < intervals.length; i++){
            int[]interval = result.get(j);
            if (intervals[i][0]<=interval[1]){
                interval[1] = Math.max(intervals[i][1], interval[1]);
            } else {
                result.add(intervals[i]);
                j++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}