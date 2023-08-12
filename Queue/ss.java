class ss {
        public static String reverseVowels(String s) {
            char ch[]=s.toCharArray();
            int n= ch.length;
            
            int low=0;
            int high=n-1;
    
            while(low<high){
                
                if((ch[low]=='a'||ch[low]=='e'||ch[low]=='i'||ch[low]=='o'||ch[low]=='u') && 
                    (ch[high]=='a'||ch[high]=='e'||ch[high]=='i'||ch[high]=='o'||ch[high]=='u')){
                          char swap=ch[high];
                           ch[high]=ch[low];
                           ch[low]=swap;
                    }

            }
             s=new String(ch);
             return s;  
    
        }
    
    public static void main(String[] args) {
     String ans=   reverseVowels("leetcode");
     System.out.println(ans);
    }
}