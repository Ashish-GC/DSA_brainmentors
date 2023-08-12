public class calculate {

    // Addition
    static int[] add(int arr1[],int arr2[],int n1,int n2){
          int c,d; c=0;
        int result[]=new int[n1>=n2?n1:n2];
        int k=result.length-1;
           n1=n1-1;
           n2=n2-1;

        while(k>=0){
            d=c;
            if(n1>=0){
                d=d+arr1[n1];
            }
            if(n2>=0){
                d=d+arr2[n2];
            }
            c=d/10;
            d=d%10;
            result[k]=d;

            k--;
            n1--;
            n2--;
        }
           return result;     
    }


    // Substraction

      static int[] sub(int arr1[],int arr2[],int n1,int n2){
          int d,c;c=0;
        int result[]=new int[n1>=n2?n1:n2];
        int k=result.length-1;
           n1=n1-1;
           n2=n2-1;
            
           while(k>=0){
             d=0;
             int n2v= n2>=0?arr2[n2]:0;
             
             if(arr1[n1]+c>=n2v){
                 d=d+arr1[n1]+c-n2v;
                 c=0;
             }
              if(arr1[n1]+c<n2v){
                  d=d+arr1[n1]+c+10-n2v;
                c=-1;
              }
             result[k]=d;
             
             k--;
             n1--;
             n2--;
           }
        
           return result;     
    }


    public static void main(String[] args) {
        
        int arr1[]={1,0,0,0};
        int arr2[]={1};
          
        int n1,n2;

           n1=arr1.length;
           n2=arr2.length;
       
           // Addition
        int addition[]=add(arr1,arr2,n1,n2);
        for(int element : addition ){
            System.out.print(element+" ");
        }
           System.out.println();

            int arr3[]={1,0,0,0};
            int arr4[]={1};
             int n3=arr1.length;
           int n4=arr2.length;
        // Substraction
        int Substraction[]=sub(arr3,arr4,n3,n4);
        for(int element : Substraction ){
            System.out.print(element+" ");
        }
    }
}
