import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CountCharInFile {
    void readFile(String fileLocation)throws FileNotFoundException {
        try(FileInputStream red= new FileInputStream(fileLocation)){
            int u;
            int count=0;
            int count_word=0;
            int n=0;
            while((u=red.read())!=-1){
                if(count>0&&(char)u!='.'&&(char)u!=' '){
                    n+=1;
                }
                count+=1;
                if(n>0&&(char)u==' '){
                    count_word+=1;
                    n=0;
                } 
                
            }
            if(n>0){
                count_word+=1;
            }
            System.out.println("count: "+count+"\n"+"Count_word: "+count_word);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        String fileLocation=s.nextLine();
        CountCharInFile obj = new CountCharInFile();
        try{
            obj.readFile(fileLocation);
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("File operation attemted");
        }  
    } 
}
