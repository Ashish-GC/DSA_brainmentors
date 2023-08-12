public class gasstation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
           int startingPoint=0;
           int surplus=0;
           int deficit=0;

        for(int i=0;i<gas.length;i++){
                surplus=surplus+gas[i]-cost[i];
                if(surplus<0){
                    startingPoint=i+1;
                    deficit+=surplus;
                    surplus=0;
                }
        }
        if(surplus+deficit>=0){
            return startingPoint;
        }
        return -1;
    }
}
