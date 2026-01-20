class Solution {
    public int romanToInt(String s) {
        char [] symbol = {'I','V','X','L','C','D','M'};
        int [] value = {1,5,10,50,100,500,1000};
        int result = 0;
        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j <= symbol.length; j++){
                if (i+1 < s.length()){
                    if (s.charAt(i) =='I' && s.charAt(i+1) =='V'){
                        result+=4;
                        i++;
                        break;
                    }

                    if (s.charAt(i) =='I' && s.charAt(i+1) =='X'){
                        result+=9;
                        i++;
                        break;
                    }

                    if (s.charAt(i) =='X' && s.charAt(i+1) =='L'){
                        result+=40;
                        i++;
                        break;
                    }

                    if (s.charAt(i) =='X' && s.charAt(i+1) =='C'){
                        result+=90;
                        i++;
                        break;
                    }

                    if (s.charAt(i) =='C' && s.charAt(i+1) =='D'){
                        result+=400;
                        i++;
                        break;
                    }

                    if (s.charAt(i) =='C' && s.charAt(i+1) =='M'){
                        result+=900;
                        i++;
                        break;
                    }
                }
                if (s.charAt(i) == symbol[j]){
                    result+=value[j];
                    break;
                }
            }
        }
        return result;
    }
}