 class s {
    public static void main(String[] args) {
        String s="ab_a";
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>=65 && ch<=122){
                ans=ans+ch;
            }
        }
        String ans2="";
              for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch>=65 && ch<=122){
                ans2=ans2+ch;
            }
        }

        System.out.println(ans);
        System.out.println(ans2);
    }
}
