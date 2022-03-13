 package Games.outdoor;
 import java.util.Scanner;

 public class Football 
    {
        String pname;
        Scanner sc = new Scanner(System.in);
        public Football()
        {
            System.out.println("Enter the Football player name");
            pname =sc.next();
        }

        public Football(String s)
        {
            pname = s;
        }

        public String disp()
        {
            return pname;
        }
    }