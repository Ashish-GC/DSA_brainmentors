public class DiceCount {
    
    // recursion
    static int countways(int current,int target){
       if(current==target){
        return 1;
       }
       if(current>target){
        return 0;
       }
               int ways=0;
       for(int dice=1;dice<=6;dice++){
              ways+=countways(current+dice,target);
       }
       return ways;
    }
    // memorization
        static int countwaysM(int current,int target,int []cache){
             if(current==target){
        return 1;
       }
       if(current>target){
        return 0;
       }
       if(cache[current]!=0){
        return cache[current];
       }
               int ways=0;
       for(int dice=1;dice<=6;dice++){
              ways+=countways(current+dice,target);
       }
       cache[current]=ways;
       return ways;
        }
    public static void main(String[] args) { 
        int target=4;
       System.out.println(countways(0,4)); 
       int cache[]=new int[target+1];
       System.out.println(countwaysM(0,target,cache));
    }
}
