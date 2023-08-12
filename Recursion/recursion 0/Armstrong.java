public class Armstrong {
    
    // stack fall method 
    static double checkfall(int num){
       if(num==0){
        return 0;
       }
       int d= num%10;
     double result =checkfall(num/10);
     return result+ Math.pow(d,3);
    }

    // stack build
    static double check(int num,double result){
   if(num==0){
    return result;
   }
   int d=num%10;
    result= result+(Math.pow(d,3));
   return check(num/10,result);
    }


    public static void main(String[] args) {

     int num=153;
        double res= check(num,0.0);
      if(res==num){System.out.println("yes it is an armstrong number");}
      else{
        System.out.println("No it is not an armstrong number");
      }
    

    double resfall= checkfall(num);
      if(res==num){System.out.println("yes it is an armstrong number");}
      else{
        System.out.println("No it is not an armstrong number");
      }
    }
}
