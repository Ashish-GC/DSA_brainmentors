import java.util.ArrayList;

public class DiceGame {
    static ArrayList<String> dicegame(int start,int end){
      if(start==end){
        ArrayList<String> result =new ArrayList<>();
        result.add("");
        return result;
      }
      if(start>end){
        ArrayList<String> result =new ArrayList<>();
        return result;
      }

      ArrayList<String> result = new ArrayList<>();

      for(int dice=1;dice<=6;dice++){
        ArrayList<String> temp =dicegame(start+dice,end);
          for(String s : temp ){
            result.add(dice+s);
          }
      }
      return result;

    }
    public static void main(String[] args) {
           ArrayList<String> result= dicegame(0,10);
           System.out.println(result);
    }
}
