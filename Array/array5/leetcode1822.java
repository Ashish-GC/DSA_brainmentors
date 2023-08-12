class leetcode1822 {
   static int signFunc(double product){
           if(product>0){return 1;}
           else if(product<0){return -1;}
           else{
               return 0;
           }
    }
   static int arraySign(int[] nums) {
        double product=1;
        for(int i=0;i<nums.length;i++){
            product*=nums[i];
        }
         System.out.print(product);
        return signFunc(product);
    }
    public static void main(String[] args) {
        int nums[]={41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        System.out.print(arraySign(nums));
    }
}
