public class sumofnatural {

    // Stack build method
    static void sum(int num,int result){
        if(num==0){
            System.out.println(result);
            return;
        }
        result=result+num;
        sum(num-1,result);
    }

    // Stack fall method
static int sum(int num){
    if(num==1){
     return 1;
    }
    int result=sum(num-1);
    return result+num;
}


    public static void main(String[] args) {
        sum(100,0);
        System.out.println(sum(100));
    }
}
