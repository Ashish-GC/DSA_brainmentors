import java.util.Arrays;

 class l414 {
   static int thirdMax(int[] nums) {
       int n=nums.length;
       Arrays.sort(nums);

        int count=0;
        int third=nums[n-1];

       for(int i=n-2;i>=0;i--){
               if(nums[i]!=third){
                 third=nums[i];
                 count++;
               }
               if(count==2){
                 return third;
               }
              
       }

          return (n-1);
    }
  
    public static void main(String[] args) {
        int arr[]={1,1,1,1,2,3,3,3,3,3,3,4};
        System.out.println(thirdMax(arr)); 
    }
}

