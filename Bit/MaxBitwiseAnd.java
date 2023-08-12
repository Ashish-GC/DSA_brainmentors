class MaxBitwiseAnd{
    static int calculate(int arr[],int n){
        int result=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){                    
                if((arr[i]&arr[j])>0){
                   result= arr[i]&arr[j];
                }
              
            }
        }
        return result;
    }
    public static void main(String[] args) {
        
              int arr[]={3,5,8,10,12};
               System.out.println("Maximum Bitwise AND = "+calculate(arr,arr.length)); 
    }
}