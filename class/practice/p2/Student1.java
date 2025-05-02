import java.io.*;


class Student1 implements Serializable
{
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10;
    
    
    public Student1()  // Default Constructor (For Reading)
    {
        
    }
    public Student1(int r,String n,float a,String d)
    {
        rollno=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
       
    }
    
    public String toString()
    {
        return "\nStudent Details\n"+
                "\nRoll ="+rollno+
                "\nName ="+name+
                "\nAverage ="+avg+
                "\nDept ="+dept+
                "\nData ="+Data;
     
    }
    
}