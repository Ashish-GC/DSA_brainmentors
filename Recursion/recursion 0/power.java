public class power {
   
    // Stack building method
    static void pow(int num,int p,int result){
       
      if(p==0)
      { System.out.println(result);
         return;
           }
         result = result*num;
         pow(num,p-1,result);
    }

    // stack fall method
    static int pow(int num,int p)
    {
              if(p==0){
                return 1;
              }
            
             int result= pow(num,p-1);
             result= result*num;
         return result;
    }


    public static void main(String[] args) {
       
        pow(2,10,1);
       System.out.println( pow(2,10));
    }
}
