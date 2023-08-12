import java.util.ArrayList;
import java.util.Stack;

class thisisthe {
     static int[] asteroidCollision(int[] asteroids) {
       Stack<Integer> stack = new Stack<>();
       for(int i=0;i<asteroids.length;i++){
           if(stack.isEmpty() || asteroids[i]>0){
               stack.push(asteroids[i]);
           }
           else{
              while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<Math.abs(asteroids[i])){
                   stack.pop();
              }
           
                   if(!stack.isEmpty() && stack.peek()==Math.abs(asteroids[i])){
                    stack.pop();
                    }
                     else{
                          if(stack.isEmpty() || stack.peek()<0 ){
                                stack.push(asteroids[i]);
                              }
                            }    
           }
       }                 
       
            int size = stack.size();
             int ans[]=new int[size];
    
            while(!stack.empty()){
                ans[--size] = stack.peek();
                stack.pop();}
    
                return ans;
        }
    
        

    public static void main(String[] args) {
        int num[]={10,5,-1};
            int result[]= asteroidCollision(num);
       for(int element : result){
            System.out.println(element);
        }
    }
}

