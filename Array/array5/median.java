public class median {
     public static void main(String[] args) {
        int num1[]={1,2};
        int num2[]={3,4};
        
            int n1=num1.length;
            int n2=num2.length;
            int x=n1+n2;
            int i=0;
            int j=0;
            int k=0;
         int merge[]=new int [n1+n2];
        
         //  merge both the array
            while(i<n1 || j<n2){
                    if(i>=n1){
                        merge[k]=num2[j];
                        j++;
                        k++;
                        if(j>=n2){break;}
                    }
                    if(j>=n2){
                        merge[k]=num1[i];
                        i++;
                        k++;
                        if(i>=n1){break;}
                    }
                   if(i<n1 && j<n2){
                    if(num1[i]<num2[j]){
                        merge[k]=num1[i];
                        k++;
                        i++;
                    }
                    else{
                        merge[k]=num2[j];
                        j++;
                        k++;
                    }      
                   }
                   
            }
                 for(int element : merge){System.out.print(element);}
            // calculate median
            if(x%2==0){
                float ans1=merge[x/2];
                float ans2=merge[(x-1)/2];

                 System.out.println((ans1+ans2)/2);
            }  
            else{
                float ans1=merge[x-1/2];
                  System.out.println(ans1);
            }
     }
}
