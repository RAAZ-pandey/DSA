public class FindNumbers {
  public static void main(String[] args) {
     int[] arr = { 10, 125, 5588, 21789, -196, -5863, 3 };
     System.out.println(findNumbers(arr));
    
  }

   static int findNumbers(int[] nums) {
        int count =0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
          int numberOfDigits = digits(num);

        //     if(numberOfDigits % 2 == 0){
        //         return true;
        // }
        // return false;
        // }

      return numberOfDigits % 2 == 0;
    }

    static int digits(int num){
        if(num < 0){
            num*=-1;
        }

       return (int)(Math.log10(num)) + 1;
    }

    // //it'll have more time complexity
    // static int digits(int num){
    //     if(num < 0){
    //         num*=-1;
    //     }

    //   if(num == 0){
    //             return 1;
    //         }

    //         int count =0;
    //         while(num > 0){
    //             count++;
    //             num/=10;
    //         }
    //     return count;
    //       }
}
