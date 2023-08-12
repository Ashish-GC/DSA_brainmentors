public class editDistance {
    static int mindistance(String s1,String s2,int m,int n){
              if(m==0){
                return n;
              }
              if(n==0){
                return m;
              }
        if(s1.charAt(m)==s2.charAt(n)){
                return mindistance(s1,s2,m-1,n-1);
               }
               else{
                 int insert=mindistance(s1, s2, m, n-1);
                 int delete=mindistance(s1, s2, m-1, n);
                 int replace=mindistance(s1, s2, m-1,n-1);
                int min=Math.min(insert,delete);
                return 1+Math.min(replace,min);
                }
    }
    public static void main(String[] args) {
        String s1="SATURDAY";
        String s2="SUNDAY";

       int result=  mindistance(s1,s2,s1.length()-1,s2.length()-1);
    System.out.println(result);
    }
}
