public class decimaltobinary {
   public static void main(String[] args) {
     int n=12;
     StringBuilder ans = new StringBuilder();
    while(n>0){
        int d= n%2;
        ans.append(d);
        n=n>>1;
   }
   System.out.println(ans.reverse());
}
}
