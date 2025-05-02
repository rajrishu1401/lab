import java.io.*;
public class StudentInformation {
    String name;
    int rollNo;
    char grade;
    StudentInformation(String name,int rollNo,char grade){
        this.name=name;
        this.rollNo=rollNo;
        this.grade=grade;
    }
    void store(){
        try(FileWriter wr=new FileWriter("student.text",true)){
            wr.write("Name: "+this.name+", Roll Number: "+this.rollNo+", Grade: "+this.grade+"\n");
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] arg){
        StudentInformation s1=new StudentInformation("Aman",120112,'A');
        StudentInformation s2=new StudentInformation("Parul",120131,'B');
        s1.store();
        s2.store();
    }
}
