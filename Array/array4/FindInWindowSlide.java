public class FindInWindowSlide {
    public static void main(String[] args) {
      int arr[]={1,2,3,2,1,2,3,1};
        int k=3;
        int occ=2;
         int f=0;

        for(int i=0;i<k;i++){
          if(arr[i]==occ){
            f++;
             System.out.println(f);
          }
        }
        int out;
       
        for(int i=k;i<arr.length;i++){
          out=arr[i-k];
          if(out==occ){
            f--;
          }
           if(arr[i]==occ){f++;}
            System.out.println(f);
        }
       
    }
}


