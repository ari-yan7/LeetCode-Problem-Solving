class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean flag = false;
        char [] s_arr = new char [s.length()];
        char [] t_arr = new char [t.length()];
        int index = -1;
        int check = 0;

        if (s.length()==0){
            return true;
        }

        for (int i = 0; i < s.length(); i++){
            s_arr[i] = s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++){
            t_arr[i] = t.charAt(i);
        }

        for (int i = 0; i < s.length(); i++){
            flag = false;
            for (int j = index+1; j < t.length(); j++){
                if (s_arr[i] == t_arr[j]){
                    index = j;
                    flag = true;
                    check++;
                    break;
                }
            }
            if (!flag){
                return flag;
            }
        }
        return flag;
    }
}