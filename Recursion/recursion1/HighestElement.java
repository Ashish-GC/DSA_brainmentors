public class HighestElement {
    static void highest(int arr[],int count,int result){
     if(arr.length-1==count){
        System.out.println(result);
        return;
     }

        if(arr[count]>result){
            result=arr[count];
        }
        highest(arr, count+1, result);
    }
    public static void main(String[] args) {
        int arr[]={29,59,34,1,95,23}; //highest element = 95

        highest(arr,0,0);
    }
}
