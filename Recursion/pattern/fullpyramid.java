
public class fullpyramid {
    static void printSpace1(int noOfSpaces) {
        if(noOfSpaces == 0) {
            return;
        }
        System.out.print(" ");
        printSpace1(noOfSpaces-1);
    }

    static void printStar1(int noOfStar) {
        // Base Case
        if(noOfStar == 0) {
            return;
        }
        // Processing Logic
        System.out.print("* ");
        // Small Problem
        printStar1(noOfStar - 1);
    }

    static void printPattern1(int rows, int currentRow) {
        if(rows == 0) {
            return;
        }
        printSpace1(rows-1);
        printStar1(currentRow);  // print the row
        System.out.println();   // move to the new line
        printPattern1(rows-1, currentRow+1);
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
        System.out.print("* ");
        // Small Problem
        printStar2(noOfStar - 1);
    }

     static void printPattern2(int rows, int currentRow) {
        if(rows == 0) {
            return;
        }
        printSpace2(currentRow);
        printStar2(rows);  // print the row
        System.out.println();   // move to the new line
        printPattern2(rows-1, currentRow+1);
    }

    public static void main(String[] args) {
        printPattern1(5, 1);
        printPattern2(4, 1);
    }
}



    

   


