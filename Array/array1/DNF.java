
public class DNF {

    public static void main(String[] args) {
        int arr[] = { 1,0,1,2,0,0,0,0,0,1,2,0};

        int low, high, mid;
        low = 0;
        high = arr.length - 1;
        mid = 0;
        int temp;

        while (mid<=high) {
            if (arr[mid] == 0) {
              
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low = low + 1;
                    mid=mid+1;
                
            }
           else if (arr[mid] == 1) {
                mid = mid + 1;
            }

          else  if (arr[mid] == 2) {
            
                    temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                   high = high - 1;
                
            }
        }

        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}
