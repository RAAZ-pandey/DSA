class Solution {
    public String intToRoman(int num) {
        // int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        // String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        // StringBuilder sb = new StringBuilder();

        // for (int i = 0; i < values.length && num > 0; i++) {
        //     while (num >= values[i]) {
        //         num -= values[i];
        //         sb.append(symbols[i]);
        //     }
        // }
        // return sb.toString();
    



// Another way which is more optimal and efficient time complexity

  StringBuilder sb = new StringBuilder();
        
        //Handle M
        while(num >= 1000){
            num -= 1000;
            sb.append('M');
        }

        if(num >= 900){
            num -= 900;
            sb.append("CM");
        }

        //Handle D
        if(num >= 500){
            num -= 500;
            sb.append('D');
        }

        //Handle CD
        if(num >= 400){
            num -= 400;
            sb.append("CD");
        }

        while(num >= 100){
            num -= 100;
            sb.append("C");
        }

        if(num >= 90){
            num -= 90;
            sb.append("XC");
        }

        if(num >= 50){
            num -= 50;
            sb.append('L');
        }

        if(num >= 40){
            num -= 40;
            sb.append("XL");
        }

        while(num >= 10){
            num -= 10;
            sb.append('X');
        }

        if(num >= 9){
            num -= 9;
            sb.append("IX");
        }

        if(num >= 5){
            num -= 5;
            sb.append('V');
        }

        if(num >= 4){
            num -= 4;
            sb.append("IV");
        }

        while(num > 0){
            num -= 1;
            sb.append('I');
        }

        String result = sb.toString();

        return result;

      }
  } 
