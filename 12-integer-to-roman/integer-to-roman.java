class Solution {
    public String intToRoman(int num) {
        String result = "";
        int div = 0;
        if (num/1000 > 0) {
            div = num / 1000;
            num = num % 1000;
            for (int i = 0; i < div; i++) {
                result += "M";
            }
        }
        if (num / 900 > 0) {
            div = num / 900;
            num = num % 900;
            result += "CM";
        }
        if (num / 500 > 0) {
            div = num / 500;
            num = num % 500;
            result += "D";
        }
        if (num / 400 > 0) {
            div = num / 400;
            num = num % 400;
            result += "CD";
        }
        if (num / 100 > 0) {
            div = num / 100;
            num = num % 100;
            for (int i = 0; i < div; i++) {
                result += "C";
            }
        }
        if (num / 90 > 0) {
            div = num / 90;
            num = num % 90;
            result += "XC";
        }
        if (num / 50 > 0) {
            div = num / 50;
            num = num % 50;
            result += "L";
        }
        if (num / 40 > 0) {
            div = num / 40;
            num = num % 40;
            result += "XL";
        }
        if (num / 10 > 0) {
            div = num / 10;
            num = num % 10;
            for (int i = 0; i < div; i++) {
                result += "X";
            }
        }
        if (num / 9 > 0) {
            div = num / 9;
            num = num % 9;
            result += "IX";
        }
        if (num / 5 > 0) {
            div = num / 5;
            num = num % 5;
            result += "V";
        }
        if (num / 4 > 0) {
            div = num / 4;
            num = num % 4;
            result += "IV";
        }
        if (num / 1 > 0) {
            div = num / 1;
            num = num % 1;
            for (int i = 0; i < div; i++) {
                result += "I";
            }
        }
        return result;
    }
}