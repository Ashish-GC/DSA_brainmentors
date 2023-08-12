import java.util.Arrays;

class thirdLargest{
    static void result(int arr[]){
           Arrays.sort(arr);
           System.out.println("Third largest element : " +arr[arr.length-3]);
    }
    public static void main(String[] args) {
        
        int arr[]={30,50,10,20,40,60,80,70,100,90};
        result(arr);
    }
}