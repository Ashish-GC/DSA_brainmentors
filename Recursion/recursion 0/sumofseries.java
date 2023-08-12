public class sumofseries{

    // Stack build method
    static void sum(int num,double result){
        if(num==0){
            System.out.println(result);
            return;
        }
        result=result+(num/Math.pow(num,num));
        sum(num-1,result);
    }

    // Stack fall method
static double sum(int num){
    if(num==1){
     return 1;
    }
    double result=sum(num-1);
    return result+(num/Math.pow(num,num));
}


    public static void main(String[] args) {
        sum(3,0.0);
        System.out.println(sum(3));
    }
}

