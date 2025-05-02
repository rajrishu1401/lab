import java.util.*;
import java.io.*;

public class IO2 {
    public static void main(String [] arg) throws IOException{
        try(FileReader d1=new FileReader("file1.text");FileWriter d2=new FileWriter("file2.text");FileWriter d3 = new FileWriter("file3.text")){
            StringBuilder data=new StringBuilder(15);
            int d;
            while((d=d1.read())!=-1){
                data.append(Character.toLowerCase((char)d));
            }
            d2.write(data.toString());
            d3.write((data.toString()).toUpperCase()+"\n"+data.toString());
        }
    }
}
