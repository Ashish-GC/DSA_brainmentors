import java.util.Arrays;
import java.util.HashMap;

class leetcode1365 {
   static int[] smallerNumbersThanCurrent(int[] nums) {
        // Approach 1
        int arr[]=nums.clone();
        Arrays.sort(arr);

        HashMap <Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if((map.get(arr[i]))==null){
                map.put(arr[i],i);
            }
        }

        int output[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            output[i]=map.get(nums[i]);
        }
        return output;

    }
    public static void main(String[] args) {
        int nums[]={8,1,2,2,3};
       
             int output[]=smallerNumbersThanCurrent(nums);
             for(int ele: output){
                System.out.print(ele);
             }
    }
  
   
}

