public class checkPrime {
//    stack build method
    static void prime(int num,int x){
        if(x==num ){
            System.out.println("The number is prime");
            return;
        }
             if(num%x==0 || num==0){
                System.out.println("Not prime");
                return;
             }

        prime(num,x+1);
    }

    // stack fall method
    static int primefall(int num,int x){
           if(num==x || num==0){
            return num;
           }
          
       int result= primefall(num,x+1);
       if(result%x==0){
        return 0;
       }
       return result;
    }

    public static void main(String[] args) {
        prime(13,2);
           int result=  primefall(13,2);
           if(result!=0){
            System.out.println("prime number");
           }
           else{
            System.out.println("not prime");
           }
    }
}
