public class MyAtio {
    public int myAtoi(String s) {
        if(s==null) return 0;

        s=s.trim();
        
        if(s.length()==0) return 0;
        
        int sign = +1;
        long ans = 0;
        if(s.charAt(0) == '-') sign = -1;
        
        int MAX = Integer.MAX_VALUE, MIN = Integer.MIN_VALUE;
		
		// initiate the starting pointer
        int i = (s.charAt(0) == '+' || s.charAt(0) == '-') ? 1 : 0;
		
        while(i < s.length()) {
            if(s.charAt(i) == ' ' || !Character.isDigit(s.charAt(i))) break;
            ans = ans * 10 + s.charAt(i)-'0';
            // check the conditions
            if(sign == -1 && -1*ans < MIN) return MIN;
            if(sign == 1 && ans > MAX) return MAX;
            
            i++;
        }
        
        return (int)(sign*ans);
    }

}

//this is an optimizes solution with better time complexicity
// public int myAtoi(String s) {
//      int result = 0;
//       int sign = 1;
//        int i = 0; 
//        while (i < s.length() && s.charAt(i) == ' ')
//         i++;
//          if (i < s.length() && s.charAt(i) == '-') {
//              sign = -1; 
//              i++;
//         } else if (i < s.length() && s.charAt(i) == '+')
//                  i++;
//      for (i=0; i < s.length(); i++) {
//          if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
//           {
//              if (sign == -1 && (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && s.charAt(i) >= '8')))
//               return -2147483648;
//           else if (sign == 1 && (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && s.charAt(i) >= '7')))
//            return 2147483647;
//      result *= 10;
//     result += s.charAt(i) - '0';
//  }
//   else break; 
// }
// result *= sign; 
// return result; 
//  }