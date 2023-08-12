public class diagonallinepattern {

    static void printstar(int star,int rows){
       if(star==6){
        return;
       }
       if(star==rows){
          System.out.print("*");
       }
       else{
        System.out.print(" ");
       }
       printstar(star+1,rows);
      
    }
    static void printpattern(int rows,int current){
        if(rows==0){
            return;
        }
        printstar(current,rows);
        System.out.println("");
        printpattern(rows-1,current);
    }
    public static void main(String[] args) {
        printpattern(5,1);
    }
}
