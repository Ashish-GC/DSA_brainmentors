class editDistanceTabulation{
    public static void main(String[] args) {
    String s1="SATURDAY";
    String s2="SUNDAY";
     int m=s1.length();
     int n=s2.length();

     int mindist[][]=new int[m+1][n+1];

     for(int i=0;i<=m;i++){
        for(int j=0;j<=n;j++){
             if(i==0){
                mindist[i][j]=j;}
             else if(j==0){
                mindist[i][j]=i;}
            
                else{
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                mindist[i][j]=mindist[i-1][j-1];
            }
            else{
                // up,diagonal,left =>min
                int insert=mindist[i][j-1];
                int replace=mindist[i-1][j-1];
                int delete=mindist[i-1][j];

                mindist[i][j]= 1+Math.min(insert,Math.min(replace,delete));
            }
        }
        }
     }

     System.out.println(mindist[m][n]);
    }
}