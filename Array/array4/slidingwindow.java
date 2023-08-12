class slidingwindow{
    public static void main(String[] args) {
        int arr[]={2,1,2,3,4,5,7,0,8};
          int k=3;
          int sum=0;
        for(int i=0;i<k;i++){
            sum+= arr[i];
        }
       System.out.print(sum+" ");
       for(int i=k;i<arr.length;i++){
        sum=sum-arr[i-k]+arr[i];
        System.out.print(sum+" ");
       }
    }
}