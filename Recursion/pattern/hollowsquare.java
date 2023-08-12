public class hollowsquare {
      static void printspace(int space){
               if(space==0){
                return;
               }
               if(space==1 || space==5){
                System.out.print("*");
               }
               else{
                System.out.print(" ");
               }
                
                        printspace(space-1);
      }

    static void printstar(int star){
       if(star==0){
        return;
       }
         System.out.print("*");
       printstar(star-1);
      
    }
    static void printpattern(int rows,int current){
        if(rows==0){
            return;
        }
        if(rows==5 || rows==1 )
          {
            printstar(current);
        } 
          else{
            printspace(current);
        }

        System.out.println("");
        printpattern(rows-1,current);
    }
    public static void main(String[] args) {
        printpattern(5,5);
    }
}