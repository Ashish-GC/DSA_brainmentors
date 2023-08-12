


import java.util.*;
class Reversal
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
            String s = sc.next ();
    		System.out.println (countRev (s));
        sc.close();
    }

  static  int countRev (String input)
    {
      int len = input.length();

    if (len % 2 != 0)
        return -1;
    int ans = 0;
 
    int i;
    int open = 0;
    int close = 0;
 
    for (i = 0; i < len; i++)
    {
        if (input.charAt(i) == '{')
            open++;

        else
        {
            if (open == 0)
                close++;
            else
                open--;
        }
    }
 
    ans = (close / 2) + (open / 2);
    close %= 2;
    open %= 2;
    if (close != 0)
        ans += 2;
 
    return ans; 
        
    }
}
