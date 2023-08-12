public class EmployeeSalary {
   static int[] totalSalary(int salary[],int count){
        if(salary.length-1==count){
            int result[]=new int[count];
                   return result;
        }
        int result[]=totalSalary(salary, count+1);
        int tax = (10* salary[count])/100;
        result[count]=salary[count]+tax;
        return result;
        }
    public static void main(String[] args) {
        int salary[]={100000,200000,300000,120000,400000,305000};
        int count=0;
      int result[]=  totalSalary(salary,count);

      for(int i=0;i<result.length;i++){
        System.out.print(result[i]+", ");
      }
    }
}
