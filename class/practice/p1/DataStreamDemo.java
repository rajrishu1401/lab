import java.io.*;
public class DataStreamDemo 
{
    public static void main(String[] args)throws Exception
    {
        //writing in a file
        FileOutputStream fos=new FileOutputStream("Student2.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        
        Student s1=new Student();
        s1.sapid=10;
        s1.name="John";
        s1.dept="CSE";
        s1.avg=75.9f;
        dos.writeInt(s1.sapid);
        dos.writeUTF(s1.name);
        dos.writeUTF(s1.dept);
        dos.writeFloat(s1.avg);
        
        
        dos.close();
        fos.close();
        
        
        //reading from file
        FileInputStream fis=new FileInputStream("Student2.txt");
        DataInputStream dis=new DataInputStream(fis);
        
        Student s=new Student();
        
        s.sapid=dis.readInt();
        
        s.name=dis.readUTF();
        
        s.dept=dis.readUTF();
        s.avg=dis.readFloat();
        
        System.out.println("Sap ID= "+s.sapid);
        System.out.println("Name ="+s.name);
        System.out.println("Average ="+s.avg);
        System.out.println("Dept ="+s.dept);
        
        
        dis.close();
        fis.close();
    }
}
