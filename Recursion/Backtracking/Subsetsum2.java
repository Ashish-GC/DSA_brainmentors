public class Subsetsum2 {
    static int count=0;
    static void compute(int nums[],int index,int sum,int target){
      if(index==nums.length){
         if(target==sum){
          count++;
          }
      }
      
      else{
        // include
        compute(nums,index+1,sum+nums[index],target);
        // not include
         compute(nums,index+1,sum-nums[index],target);
      }
        
    }
    static int findTargetSumWays(int[] nums, int target) {
      
      compute(nums,0,0,target);
      return count;
    }
    public static void main(String[] args) {
        int nums[]={1};
        System.out.println(findTargetSumWays(nums,1));
    }
}

