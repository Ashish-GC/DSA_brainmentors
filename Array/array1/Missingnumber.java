public class Missingnumber {
    
    static int missingNumber(int array[], int n) {
        int count[]=new int[n];
        int missing=0;
        
        for(int i=0;i<n;i++){
            count[i]=0;
        }
        
        for(int i=0;i<array.length-1;i++){
            count[array[i]]=1;
        }
        
        for(int i=0;i<n;i++){
            if(count[i]==0){
                missing=i;
            }
        }
        
        return missing;
    }

public static void main(String[] args) {
    int arr[]={1};
    System.out.println( missingNumber(arr,2) );
    
}
}
