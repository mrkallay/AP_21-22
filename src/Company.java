/*
Created by Brian Kallay
*/

public class Company
{
    private String name = "Default Company";
    private int numberOfEmployees;

    public Company()
    {
        //name = null;
        //numberOfEmployees = 0;
    }

    public Company(String n)
    {
        name = n;
        numberOfEmployees = 0;
    }

    public Company(String n, int empCount)
    {
        name = n;
        numberOfEmployees = empCount;
    }
}
