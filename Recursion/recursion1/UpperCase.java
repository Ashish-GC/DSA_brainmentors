

public class UpperCase {
    static String[] uppercase(String str[],int count){
       if(str.length==count){
           String result[]=new String[count];
            return result;  
       }  
       
      String[] result =uppercase(str,count+1);   
      String str1 =str[count].toUpperCase() ;
       result[count]= str1;
       return result;
    }
   public static void main(String[] args) {
    String str[]={"foo","bar","world"};
    int count=0;
       String result[]=uppercase(str,count);
       for(int i=0;i<str.length;i++){
        System.out.print(result[i]+",");
       }
   } 
}
