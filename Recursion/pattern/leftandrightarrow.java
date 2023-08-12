
public class leftandrightarrow{
    
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
        System.out.print("*");
        // Small Problem
        printStar(noOfStar - 1);
    }

    static void printPattern(int rows, int currentRow) {
        if(rows == 0) {
            return;
        }
        printSpace(currentRow-1);
        printStar(currentRow);  // print the row
        System.out.println();   // move to the new line
        printPattern(rows-1, currentRow-1);
    }


 static void printSpace2(int noOfSpaces) {
        if(noOfSpaces == 0) {
            return;
        }
        System.out.print(" ");
        printSpace2(noOfSpaces-1);
    }

    static void printStar2(int noOfStar) {
        // Base Case
        if(noOfStar == 0) {
            return;
        }
        // Processing Logic
        System.out.print("*");
        // Small Problem
        printStar2(noOfStar - 1);
    }

    static void printPattern2(int rows, int currentRow) {
        if(rows == 0) {
            return;
        }
        printSpace2(currentRow-1);
        printStar2(currentRow);  // print the row
        System.out.println();   // move to the new line
        printPattern2(rows-1, currentRow+1);
    }

    public static void main(String[] args) {
        printPattern(5, 5);
         printPattern2(4, 2);
    }
}