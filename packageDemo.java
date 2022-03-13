/*Create a package called math, then use the package in your Java program to 
perform different functions like addition, subtraction, multiplication and 
division.
*/

import maths.*;

public class packageDemo
{
    public static void main(String args[])
    {
        Maths ob  = new Maths(5, 3);

        System.out.println("Addition :"+ob.add());
        System.out.println("Addition :"+ob.sub());
        System.out.println("Addition :"+ob.mult());
        System.out.println("Addition :"+ob.div());

    }
}