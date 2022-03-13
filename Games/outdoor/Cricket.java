package Games.outdoor;

import java.util.Scanner;

public class Cricket 
{
    String pname;
    Scanner sc = new Scanner(System.in);
    public Cricket()
    {
        System.out.println("Enter the Cricket player name");
        pname =sc.next();
    }

    public Cricket(String s)
    {
        pname = s;
    }

    public String disp()
    {
        return pname;
    }
}