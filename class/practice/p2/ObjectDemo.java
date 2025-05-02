import java.io.*;



public class ObjectDemo 
{
	//For Writing to Object Stream
	
        /*public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("Student3.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        Student1 s=new Student1(10,"John",89.9f,"CSE");
        
        oos.writeObject(s);
        
        fos.close();
        oos.close();
        
    } */
    
	
	// For Reading from Object Stream
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("Student3.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        Student1 s=(Student1)ois.readObject();
        
        System.out.println(s);
        
        fis.close();
        ois.close();
        
    }
}