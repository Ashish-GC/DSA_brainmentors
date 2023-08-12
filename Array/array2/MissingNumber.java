class MissingNumber {
    int missingNumber(int array[], int n) {
        int Nsum=(n*(n+1))/2;
        int Arraysum=0;
        for(int element : array){
            Arraysum=Arraysum+element;
        }
        return Nsum-Arraysum;
    }
}
