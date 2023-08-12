

class zigzag{
   
    public static void main(String[] args) {
        int arr[]={4,3,7,8,6,2,1};

        int i=0;
        int j=1;
        int k=2;
         int temp;
        while(k<arr.length){
           
            if(arr[j]<arr[i]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
             if(arr[j]<arr[k]){
                temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
             }
          i=i+2;
          j=j+2;
          k=k+2;
        }

        for( i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
    }
}