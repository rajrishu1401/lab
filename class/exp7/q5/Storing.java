import java.io.*;

public class Storing {
    static void storePer(){
        try(FileOutputStream fos=new FileOutputStream("Person.txt")){
            ObjectOutputStream oos=new ObjectOutputStream(fos);    
            PersonInfo s=new PersonInfo("Raj",99);       
            oos.writeObject(s); 
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    static void getPer(){
        try(FileInputStream fis=new FileInputStream("Person.txt")){
            ObjectInputStream ois=new ObjectInputStream(fis);
            PersonInfo s=(PersonInfo)ois.readObject();
            System.out.println(s);
        }catch(IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] arg){

        Storing.storePer();
        Storing.getPer();
        
    }
}
