public class StringLinearSearch {
    public static void main(String[] args) {
      String s = "ribhubhushan";

      System.out.println(Search(s, 'n'));
      System.out.println(Search1(s, 'n'));
    }

     static boolean Search1(String str, char element){
       if(str.length() == 0){
        return false;
      }

        for (char ch : str.toCharArray()){
            if(ch == element){
              return true;
            }
        }    
      
      return false;
       
    }

    static boolean Search(String str, char element){
       if(str.length() == 0){
        return false;
      }

        for (int i = 0; i < str.length(); i++) {
          if (element == str.charAt(i)){
            return true;
          }
        }
       
      
      return false;
       
    }
}
