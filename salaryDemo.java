/*An organization maintains the records of all its employees as per the 
designation and the hierarchy of the designation. Each employee has his basic 
information and allowances are decided as per the hierarchy of the 
designation. e. g. Normal Employee gets basic salary Rs. 5000 per month. If 
that employee is Manager, he gets 20% of basic as HRA additional. If that 
employee is Head of any department, he gets HRA + 10% of basic as Child 
Education Allowance. Use inheritance to solve this problem.*/

class Employee
{
    String empname;
    int empid;
    double basicsal = 5000;


    double totSal()
    {
        return basicsal;
    }

}

class Manager extends Employee
{
    double hra;

    double hraSal()
    {
        hra = super.totSal()+(super.totSal()*20/100);

        return hra;
    }


}


class Hod extends Manager
{
    double hodSal;

    double tothodSal()
    {
        hodSal  = super.hraSal()+(totSal()*10/100);

        return hodSal;
    }
}

public class  salaryDemo
{
    public static void main(String args[])
    {   
        Employee e1 = new Employee();
            System.out.println(e1.totSal());

        Manager m1  = new Manager();
            System.out.println(m1.hraSal());

        Hod h1 = new Hod();
        System.out.println(h1.tothodSal());
    }

}