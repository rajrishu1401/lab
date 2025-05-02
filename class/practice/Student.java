import java.io.*;
import java.util.*;

public class Student {
    static int selNo=1;
    String name;
    int roll;
    char batch;
    Student(String name,int roll,char batch){
        this.name=name;
        this.roll=roll;
        this.batch=batch;

        try{
            this.stor();
        } catch(IOException e){
            System.out.println(e);
        }finally{
            selNo++;
        }

    }
    void stor() throws IOException {
        if(selNo==1){
            try(FileWriter detail= new FileWriter("StudentDetail.text")){
                detail.write("SNo: "+selNo+"\nName: "+this.name+"\nRoll no: "+this.roll+"\nBatch: "+this.batch+"\n\n");
            }
        }else{
            System.out.println("hello");
            try(FileReader det= new FileReader("StudentDetail.text");FileWriter detail=new FileWriter("StudentDetail.text")){
                StringBuilder data=new StringBuilder(150);
                int ch;
                while((ch=det.read())!=-1){
                    
                    data.append((char)ch);
                    System.out.println(data);
                }
                System.out.println(data);
                data.append("SNo: "+selNo+"\nName: "+this.name+"\nRoll no: "+this.roll+"\nBatch: "+this.batch+"\n\n");
                detail.write(data.toString());
            }
        }
        
    }
    public static void main(String[] arg){
        Student s1 = new Student("Rishu Raj",101,'A');
        Student s2 = new Student("Raghav Sharma",102,'B');
    }
}