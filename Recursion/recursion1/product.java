import java.util.ArrayList;
import java.util.Scanner;

class product{
    static void  pro(ArrayList<Integer> num,int result,int count){
           
        if(num.size()== count){
       System.out.println("Answer : "+result);
       return;
        }
        result=result * num.get(count);
            pro(num,result,count+1);
    
    }

    public static void main(String[] args) {
       ArrayList<Integer> num = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
          
       System.out.println("no. of inputs");
       int n=sc.nextInt();
       System.out.println("list of number");
       for(int i=0 ;i<n;i++){
         num.add(sc.nextInt());
       }
      
        pro(num,1,0);
    }
}