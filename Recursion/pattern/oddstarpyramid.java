public class oddstarpyramid {

  static void printSpace(int noOfSpaces) {
        if(noOfSpaces == 0) {
            return;
        }
        System.out.print(" ");
        printSpace(noOfSpaces-1);
    }

    static void printStar(int noOfStar) {
        // Base Case
        if(noOfStar == 0) {
            return;
        }
        // Processing Logic
             System.out.print("* ");
        // Small Problem
        printStar(noOfStar - 1);
    }

    static void printPattern(int rows, int currentRow) {
        if(rows == 0) {
            return;
        }
       
         if(currentRow%2 !=0){
                 printSpace(rows-1);
                 printStar(currentRow); 
                   System.out.println();  
        }
        printPattern(rows-1, currentRow+1);
    }

    public static void main(String[] args) {
        printPattern(5, 1);
    }
}


