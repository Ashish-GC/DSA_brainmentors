import java.util.ArrayList;
import java.util.List;

public class paranthesis {
      
    private static void compute (List<String> result,int n,int opening,int closing,StringBuilder output){

        // termination condition
        if(n*2==output.length()){
            result.add(output.toString());
            return ;
        }
        // opening bracket
        if(opening<n){
            output.append("(");
            compute(result,n,opening+1,closing,output);
            output.deleteCharAt(output.length()-1);
        }
          // closing bracket
        if(closing<opening){
            output.append(")");
            compute(result,n,opening,closing+1,output);
            output.deleteCharAt(output.length()-1);
        }

    }

    public static List<String> generateParenthesis(int n) {
          StringBuilder output = new StringBuilder();
            List<String> result =new ArrayList<>();
          compute(result,n,0,0,output);
          return result;
    }
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
