import java.util.ArrayList;

public class MazePath{
    static ArrayList<String> mazepath(int row,int col,int endrow,int endcol){
        if(row==endrow && col==endcol){
           ArrayList<String> result=new ArrayList<>();
           result.add("");
            return result;
        }
        if(row>endrow || col>endcol){
             ArrayList<String> result=new ArrayList<>();
             return result;
        }

        ArrayList<String> finalresult = new ArrayList<>();
         
        ArrayList<String> down = mazepath(row+1,col,endrow,endcol);
        for(String s : down){
            finalresult.add("D"+s);
        }

        ArrayList<String> right = mazepath(row,col+1,endrow,endcol);
        for(String s : right){
            finalresult.add("R"+s);
         }
        return finalresult;
    }
    public static void main(String[] args) {
       ArrayList<String> result= mazepath(0, 0, 2, 2);
        System.out.println(result);
    }
}