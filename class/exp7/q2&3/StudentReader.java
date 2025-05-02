import java.io.*;

public class StudentReader {
    void reader()throws FileNotFoundException{
        try(FileReader re=new FileReader("student.text")){
            int u;
            while((u=re.read())!=-1){
                System.out.print((char)u);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] arg){
        StudentReader obj= new StudentReader();
        try{
            obj.reader();
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
    }
}
