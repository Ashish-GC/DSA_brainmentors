public class countZero {

    // Stack fall method
   static int count(int num)
    {
        if(num==0){
            return 0;
        }
      int result=count(num/10);
        int d=num%10;
        if(d==0){
           result=result+1;
        }
        return result;
    }

    // Stack building method
    static void count(int num,int result){
        if(num==0){
            System.out.println(result);
            return ;
        } 
        if(num%10==0){result++;}
        count(num/10,result);
    }

    public static void main(String[] args) {
        count(102030,0);
        System.out.println(count(102030));
    }
}
