import java.util.*;
import java.io.*;

class IO {
    public static void main(String [] arg) throws IOException{
        Scanner s= new Scanner(System.in);
        String dt=s.nextLine();
        try(FileWriter data=new FileWriter("file1.text")){
            data.write(dt);
        }
    }
}