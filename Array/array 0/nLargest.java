import java.util.Arrays;
import java.util.Scanner;

public class nLargest {
    static void result(int arr[],int n){
           Arrays.sort(arr);
           System.out.println("nth largest element : " +arr[arr.length-n]);
    }
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n=sc.nextInt();

        int arr[]={30,50,10,20,40,60,80,70,100,90};


        result(arr,n);
    }
}
