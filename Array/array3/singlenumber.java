public class singlenumber {
    public int singleNumber(int[] nums) {   
   
      int xor=0;
      for(int number : nums){
          xor=xor^number;
      }
      return xor;

    }
}

