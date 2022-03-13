import java.util.Scanner;//incomplete code
//contributed by harish rane
/* Create a java program for a cricket player. The program should accept the 
details from user (max 10): Player code, name, runs, innings- played and 
number of times not out. The program should contain following options:
-Enter details of players. 
-Display average runs of a single player. 
-Display average runs of all players. (Use array of objects & function 
overloading*/

class cricket//contributed by harish rane
{
    int pcode,runs,inningsplayed,notnotout;
    String pname;//contributed by harish rane
    Scanner sc = new Scanner(System.in);
    void getData()
    {
        System.out.println("Enter the name");
        pname = sc.next();//contributed by harish rane
        System.out.println("Enter the pid ");
        pcode = sc.nextInt();
        System.out.println("Enter the runs");
        runs = sc.nextInt();//contributed by harish rane
        System.out.println("Enter the innings played");
        inningsplayed = sc.nextInt();
        System.out.println("Enter no . of times player not out");
        notnotout =sc.nextInt();

    }

    void avg()
    {

    }
}