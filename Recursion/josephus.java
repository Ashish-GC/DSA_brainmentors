  class josephus {
    public static void main(String[] args) {
        int i = 1, ans = 0;
   int N=6 ; int k=2;
    // Run a while loop till i <= N
    while (i <= N) {
 
      // Update the Value of ans and Increment i by 1
      ans = (ans + k) % i;
      i++;
    }
 
    // Return required answer
    System.out.println(ans + 1); 
    }
  
}