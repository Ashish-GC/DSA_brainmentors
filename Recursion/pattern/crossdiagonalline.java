public class crossdiagonalline {
    static void printstar(int star,int rows,int x){
       if(star==6){
        return;
       }
       if(star==rows || star==x){
          System.out.print("*");
       }
       else{
        System.out.print(" ");
       }
       printstar(star+1,rows,x);
      
    }
    static void printpattern(int rows,int current,int x){
        if(rows==0){
            return;
        }
        printstar(current,rows,x);
        System.out.println("");
        printpattern(rows-1,current,x+1);
    }
    public static void main(String[] args) {
        printpattern(5,1,1);
    }
}
