class Trappingrainwater{
    public static void main(String[] args) {
        int pillar[]={4,2,0,3,2,5};

 //  prefix max
        int prefixMax[]=new int[pillar.length];
        prefixMax[0]=pillar[0];
    for(int i=1;i<pillar.length;i++)
    {
          prefixMax[i]=Math.max(prefixMax[i-1],pillar[i]);
    }

    // Suffix max
    int suffixMax[]=new int[pillar.length];
        suffixMax[pillar.length-1]=pillar[pillar.length-1];
    for(int i=pillar.length-2;i>=0;i--)
    {
          suffixMax[i]=Math.max(suffixMax[i+1],pillar[i]);
    }

//    water stored
             int water=0;
    for(int i=0;i<pillar.length;i++){
                int c=pillar[i];
          int height= Math.min(suffixMax[i],prefixMax[i]);
          if(height>c){
               water=water+height-c;
          } 

    }
            System.out.println(water);
}
}