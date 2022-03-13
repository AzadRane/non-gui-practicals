 package Games.outdoor;
 import java.util.Scanner;

 public class Hockey 
    {
        String pname;
        Scanner sc = new Scanner(System.in);
        public Hockey()
        {
            System.out.println("Enter the Hockey player name");
            pname =sc.next();
        }

        public Hockey(String s)
        {
            pname = s;
        }

        public String disp()
        {
            return pname;
        }
    }