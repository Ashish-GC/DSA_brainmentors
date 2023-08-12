import javafx.scene.paint.Stop;

public class permutation {
    static void string_permutaion(String str,String result){
      if(str.length()==0){
        System.out.println(result);
        return;
      }
      char first=str.charAt(0);
      String smallString=str.substring(1);
     string_permutaion(smallString, result);
     string_permutaion(smallString, result+first);

    }
    public static void main(String[] args) {
        string_permutaion("abc","");
    } 
}
