class rotatearray{
   static void reverse(int arr[],int low,int high){
          int temp;
          while(low<high){
              temp=arr[low];
              arr[low]=arr[high];
              arr[high]=temp;
              low++;
              high--;
          }
    }

    public void rotate(int[] nums, int k) {
        k=k%nums.length;

    //  first part reverse
        reverse(nums,0,nums.length-k-1);

    //  second part reverse
        reverse(nums,nums.length-k,nums.length-1);

    // final part
         reverse(nums,0,nums.length-1);
    }
}