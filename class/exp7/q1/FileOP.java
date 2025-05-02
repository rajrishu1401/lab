import java.util.*;
import java.io.*;
public class FileOP {
    void readFile(String fileLocation)throws FileNotFoundException {
        try(FileInputStream red= new FileInputStream(fileLocation)){
            int u;
            while((u=red.read())!=-1){
                System.out.print((char)u);
            }
            System.out.println("");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        String fileLocation=s.nextLine();
        FileOP obj = new FileOP();
        try{
            obj.readFile(fileLocation);
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("File operation attemted");
        }
    }
}
