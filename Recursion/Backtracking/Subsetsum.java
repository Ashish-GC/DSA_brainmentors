public class Subsetsum {
    



    static Boolean isSubsetSum(int N, int arr[], int sum){
    if(sum==0){
        return true;
    }
    if(N==0){
        return false;
    }
    if(arr[N-1]<=sum){
    return isSubsetSum(N-1,arr,sum-arr[N-1]) || isSubsetSum(N-1,arr,sum);
    }
    else
    {return isSubsetSum(N-1,arr,sum);}
    }

public static void main(String[] args) {
    int arr[]={3,34,4,12,5,2};
  System.out.println( isSubsetSum(6,arr, 9));
} 
}
