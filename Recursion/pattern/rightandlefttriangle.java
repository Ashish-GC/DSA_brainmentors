public class rightandlefttriangle {

    static void printStar(int noOfStar,int n) {
        // Base Case
        if(noOfStar == 0) {
            return;
        }
        // Processing Logic
       
        System.out.print(n);
        // Small Problem
        printStar(noOfStar - 1,n+1);
    }

    static void printPattern(int rows, int currentRow) {
        if(rows == 0) {
            return;
        }
        printStar(currentRow,1);  // print the row
        System.out.println();   // move to the new line
        printPattern(rows-1, currentRow+1);
    }

    public static void main(String[] args) {
        printPattern(5, 1);
    }
}
