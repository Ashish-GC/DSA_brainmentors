import java.util.Arrays;

class Solution {

        static int canPlaceFlowers(int[] flowerbed, int n) {
            int low=0;
            int high=0;
                 int place=0;
    
            for(int i=0;i<flowerbed.length-1;i++){
                        high=i+1;
                       if(flowerbed[i]==0 && flowerbed[low]==0 && flowerbed[high]==0){
                         flowerbed[i]=1;    
                       place++;
                       }
                       if(high==flowerbed.length-1 && flowerbed[i]==0){place++;}
                       low=i;       
            }
        return place;
        }
  
     public static void main(String[] args) {
        int flowerbed[]={1,0,0,0,1,0,0};
        System.out.println(canPlaceFlowers(flowerbed,3));
    }

}