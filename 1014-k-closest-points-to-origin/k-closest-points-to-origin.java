class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int rows = points.length;
        int cols = 2;
        int [] dis = new int [rows];
        for (int i = 0; i < rows; i++) {
            dis[i] = (points[i][0]*points[i][0])+(points[i][1]*points[i][1]);
        }
        int [][] result = new int [k][2];
        boolean [] check = new boolean [rows];
        for (int i = 0; i < k; i++) {
            int minindex = 0;
            int mindistance = Integer.MAX_VALUE;
            for (int j = 0; j < rows; j++) {
                if (!check[j] && dis[j] < mindistance) {
                    mindistance = dis[j];
                    minindex = j;
                }
            }
            check[minindex] = true;
            result[i][0] = points[minindex][0];
            result[i][1] = points[minindex][1];
        }
        return result;
    }
}