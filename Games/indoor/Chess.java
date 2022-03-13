package Games.indoor;

import java.util.Scanner;
  
public class Chess
{
        String pname;
        Scanner sc = new Scanner(System.in);
        public Chess()
        {
            System.out.println("Enter the Chess player name");
            pname =sc.next();
        }

        public Chess(String s)
        {
            pname = s;
        }

        public String disp()
        {
            return pname;
        }
}
