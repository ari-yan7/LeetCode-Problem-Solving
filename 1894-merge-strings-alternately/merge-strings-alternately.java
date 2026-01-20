class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result ="";
        int l1 = word1.length();
        int l2 = word2.length();
        char arr1 [] = new char [l1];
        char arr2 [] = new char [l2];
        
        for (int i = 0; i < l1; i++){
            arr1[i] = word1.charAt(i);
        }

        for (int i = 0; i < l2; i++){
            arr2[i] = word2.charAt(i);
        }
        if (l1 == l2){
            for (int i = 0; i < l1; i++){
                result += arr1[i];
                result += arr2[i];
            }
        }
        if (l1 < l2){
            for (int i = 0; i < l1; i++){
                result += arr1[i];
                result += arr2[i];
            }
            for (int i = l1; i < l2; i++){
                result += arr2[i];
            }
        }
        if (l1 > l2){
            for (int i = 0; i < l2; i++){
                result += arr1[i];
                result += arr2[i];
            }
            for (int i = l2; i < l1; i++){
                result += arr1[i];
            }
        }
        return result;
    }
}