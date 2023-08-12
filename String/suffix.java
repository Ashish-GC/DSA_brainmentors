public class suffix {

    static void findSuffix(String str){
       // Approach 1
        // String c="";
        //  for(int i=str.length()-1;i>=0;i--){
        //       char ch= str.charAt(i);
        //        c=ch+c;
        //        System.out.println(c);
        //     }

        // Approach 2
        int n=str.length()-1;
         for(int i=0;i<str.length();i++){
            System.out.println(str.substring(n-i));
         }
        

    }
    public static void main(String[] args) {
        String str = "apple";
        findSuffix(str);
    }
}