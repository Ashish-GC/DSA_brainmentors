public class binarytodecimal {
public static void main(String[] args) {
    String str = "100";
     int ans=0;
     int mask=0;
          for(int i=str.length()-1;i>=0;i--){
           char ch= str.charAt(i);
           int d=ch-'0';
               ans+=d<<mask;
               mask++;
          }
          System.out.println(ans);
}
}
