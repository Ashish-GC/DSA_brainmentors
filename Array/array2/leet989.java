import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class leet989 {

    static  List<Integer> addToArrayForm(int[] num, int k) {
         List<Integer> list = new ArrayList<>();
       int n1=num.length-1;
       int d,s,c=0;

       while(n1>=0){
           d=c;
            if(k!=0){
                c=0;
                s=k%10;
                d+=num[n1]+c+s;
                c=d/10;
                d=d%10;
                list.add(d);
                         k=k/10;
            }
            else{
                if(c==1){
                    int ans=num[n1]+c;
                     c=ans/10;
                     ans=ans%10;
                     list.add(ans);
                }
                else{
                     list.add(num[n1]);
                }
                   
            }
            n1--;
       }
       if(c!=0){
           list.add(1);
       }
       Collections.reverse(list);
       return list;
    }
    public static void main(String[] args) {
         List<Integer> list = new ArrayList<>();
         int num[]={9,9,9};
         int k=1;
         list=addToArrayForm( num,k);
         System.out.println(list);
    }
} 
