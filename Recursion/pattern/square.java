class square{
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
        printstar(current);
        System.out.println("");
        printpattern(rows-1,current);
    }
    public static void main(String[] args) {
        printpattern(5,5);
    }
}